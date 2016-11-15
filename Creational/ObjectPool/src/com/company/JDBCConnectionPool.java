package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class JDBCConnectionPool extends ObjectPool {

    private String dsn, usr, pwd;

    public JDBCConnectionPool(String driver, String dsn, String usr, String pwd) {
        try{
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    Object create() {
        try
        {
            return( DriverManager.getConnection( dsn, usr, pwd ) );
        }
        catch( SQLException e )
        {
            e.printStackTrace();
            return( null );
        }
    }

    @Override
    boolean validate(Object object) {
        try
        {
            return( ! ( ( Connection ) object ).isClosed() );
        }
        catch( SQLException e )
        {
            e.printStackTrace();
            return( false );
        }
    }

    @Override
    void expire(Object object) {
        try
        {
            ( (Connection) object ).close();
        }
        catch( SQLException e )
        {
            e.printStackTrace();
        }
    }

    public Connection borrowConnection()
    {
        return( ( Connection ) super.checkOut() );
    }

    public void returnConnection( Connection c )
    {
        super.checkIn( c );
    }
}

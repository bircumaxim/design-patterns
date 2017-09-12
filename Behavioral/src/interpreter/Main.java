package interpreter;

import java.io.File;

/**
 * Created by maxim on 7/17/17.
 */
public class Main {


    public static void walk( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk( f.getAbsolutePath() );
                System.out.println( "Dir:" + f.getAbsoluteFile() );
            }
            else {
                System.out.println( "File:" + f.getAbsoluteFile() );
            }
        }
    }


    public static void main(String[] args) {
        walk("/home/maxim/Documents/projects/temp/assets/auth/login/css");
    }
}

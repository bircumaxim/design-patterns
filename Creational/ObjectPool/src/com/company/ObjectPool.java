package com.company;

import java.util.Enumeration;
import java.util.HashMap;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public abstract class ObjectPool {
    private long expirationTime;
    protected HashMap locked, unlocked;
    abstract Object create();
    abstract boolean validate(Object object);
    abstract void expire(Object object);

    public ObjectPool() {
        expirationTime = 30000;
        locked = new HashMap();
        unlocked = new HashMap();
    }

    synchronized Object checkOut() {
        long now = System.currentTimeMillis();
        Object object;
        if(unlocked.size() > 0){
            Enumeration e = (Enumeration) unlocked.keySet();
            while (e.hasMoreElements()){
                object = e.nextElement();
                if((now - ((Long) unlocked.get(object)).longValue()) > expirationTime){
                    //expired
                    unlocked.remove(object);
                    expire(object);
                    object = null;
                } else{
                    if(validate(object)){
                        unlocked.remove(object);
                        locked.put(object, new Long(now));
                        return object;
                    } else{
                        //failed validation
                        unlocked.remove(object);
                        expire(object);
                        object = null;
                    }
                }
            }
        }
        //no objects available, create new one.
        object = create();
        locked.put(object, new Long(now));
        return object;
    }

    synchronized void checkIn(Object object) {
        locked.remove(object);
        unlocked.put(object, new Long(System.currentTimeMillis()));
    }
}

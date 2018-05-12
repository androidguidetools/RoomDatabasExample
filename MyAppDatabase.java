package com.roomexample.roomdatabasedemo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by KP on 4/26/2018.
 */
@Database(entities = {User.class},version = 1)
public abstract class MyAppDatabase extends RoomDatabase {

    public abstract MyDao myDao();
}

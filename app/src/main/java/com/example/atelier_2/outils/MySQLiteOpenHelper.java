package com.example.atelier_2.outils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class MySQLiteOpenHelper extends SQLiteOpenHelper{

    private String creation = "CREATE TABLE profil ("
            + "datemesure TEXT PRIMARY KEY,"
            + "Poids INTEGER NOT NULL,"
            + "Taille INTEGER NOT NULL,"
            + "Age INTEGER NOT NULL,"
            + "Sexe INTEGER NOT NULL);";
    /**
     * Constructeur
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * Creation de la base de donnees
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(creation);
    }

    /**
     * Mise a jour de la base de donnees
     * @param db The database.
     * @param oldVersion The old database version.
     * @param newVersion The new database version.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

package example.uuj.foodcraft;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by b00659648 on 05/04/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME = "Foods.db";
    public static final String TABLE_NAME= "Food_Table";
    public static final String COL_1= "Name";
    public static final String COL_2= "Calories";
    public static final String COL_3= "Protein";
    public static final String COL_4= "Carbohydrate";
    public static final String COL_5= "Fat";

    public DataBaseHelper(Context context ) { //constructor // when its called, database and table is created
        super(context, DATABASE_NAME, null, 1);
       // SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
    db.execSQL("create table " + TABLE_NAME + "(NAME TEXT PRIMARY KEY," +
            "CALORIES INTEGER, PROTEIN(g) INTEGER, CARBOHYDRATE INTEGER, FAT INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
    db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String Name, String Calories, String Protein, String Carbohydrate, String Fat)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, Name);
        contentValues.put(COL_2, Calories);
        contentValues.put(COL_3, Protein);
        contentValues.put(COL_4, Carbohydrate);
        contentValues.put(COL_5, Fat);
       long result = db.insert(TABLE_NAME,null ,contentValues); // inserts content Values specified above
        if (result == -1)
            return false;
        else
            return true;
    }


}

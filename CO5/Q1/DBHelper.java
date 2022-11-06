package com.example.test;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "student.db", null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table StudentDetails(name Text primary key,contact Text,dob Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop Table if exists StudentDetails");
    }
    public boolean insertuserdata(String name,String contact,String dob){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("contact",contact);
        cv.put("dob",dob);
        long result = db.insert("StudentDetails",null,cv);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean updateuserdata(String name,String contact,String dob){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("contact",contact);
        cv.put("dob",dob);
        Cursor cursor = db.rawQuery("Select * from StudentDetails where name=?",new String[]{name});
        if(cursor.getCount()>0){
            long result = db.update("StudentDetails",cv,"name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public boolean deleteuserdata(String name){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from StudentDetails where name=?",new String[]{name});
        if(cursor.getCount()>0){
            long result = db.delete("StudentDetails","name=?",new String[]{name});
            if(result==-1){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public Cursor getdata(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from StudentDetails",null);
        return cursor;
    }


}

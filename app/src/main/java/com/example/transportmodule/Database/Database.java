package com.example.transportmodule.Database;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.transportmodule.Model.Student;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteAssetHelper {
    private static final String DB_NAME="student.db";
    public static final int DB_VER=1;

    public Database(Context context) {
        super(context, DB_NAME,null, DB_VER);
    }
    @SuppressLint("Range")
    public List<Student> getStudent()
    {
        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();
        String[] sqlselect={"Name","RegisterNumber","Year","Department","Hosteller","Dayscholar","Collegebus","Privatebus","Busnumber","Boardingplace","Busfees","Vaccination","Contactnumber","Communicationaddress"};
        String tablename="students";
        qb.setTables(tablename);
        Cursor cursor=qb.query(db,sqlselect,null,null,null,null,null);
        List<Student> result=new ArrayList<>();
        if(cursor.moveToFirst())
        {
            do{
                Student student=new Student();
                student.setName(cursor.getString(cursor.getColumnIndex("Name")));
                student.setRegisterNumber(cursor.getString(cursor.getColumnIndex("RegisterNumber")));
                student.setYear(cursor.getString(cursor.getColumnIndex("Year")));
                student.setDepartment(cursor.getString(cursor.getColumnIndex("Department")));
                student.setHosteller(cursor.getString(cursor.getColumnIndex("Hosteller")));
                student.setDayscholar(cursor.getString(cursor.getColumnIndex("Dayscholar")));
                student.setCollegebus(cursor.getString(cursor.getColumnIndex("Collegebus")));
                student.setPrivatebus(cursor.getString(cursor.getColumnIndex("Privatebus")));
                student.setBusnumber(cursor.getString(cursor.getColumnIndex("Busnumber")));
                student.setBoardingplace(cursor.getString(cursor.getColumnIndex("Boardingplace")));
                student.setBusfees(cursor.getString(cursor.getColumnIndex("Busfees")));
                student.setVaccination(cursor.getString(cursor.getColumnIndex("Vaccination")));
                student.setContactnumber(cursor.getString(cursor.getColumnIndex("Contactnumber")));
                student.setCommunicationaddress(cursor.getString(cursor.getColumnIndex("Communicationaddress")));
                result.add(student);

            }while(cursor.moveToNext());
        }
        return result;
    }
    @SuppressLint("Range")
    public List<String> getNames()
    {
        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();
        java.lang.String[] sqlselect={"RegisterNumber"};
        java.lang.String tablename="students";
        qb.setTables(tablename);
        Cursor cursor=qb.query(db,sqlselect,null,null,null,null,null);
        List<String> result=new ArrayList<>();
        if(cursor.moveToFirst())
        {
            do{
                result.add(cursor.getString(cursor.getColumnIndex("RegisterNumber")));


            }while(cursor.moveToNext());
        }
        return result;
    }
    @SuppressLint("Range")
    public List<Student> getStudentByNames(String registerNumber) {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[] sqlselect = {"Name","RegisterNumber","Year","Department","Hosteller","Dayscholar","Collegebus","Privatebus","Busnumber","Boardingplace","Busfees","Vaccination","Contactnumber","Communicationaddress"};
        String tablename = "students";
        qb.setTables(tablename);
        //Cursor cursor=db.rawQuery("SELECT * FROM students where registerNumber=?",new String[]{registerNumber});
        Cursor cursor = qb.query(db, sqlselect, "registerNumber LIKE ?", new String[]{"%"+registerNumber+"%"}, null, null, null);
        List<Student> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Student student = new Student();
                student.setName(cursor.getString(cursor.getColumnIndex("Name")));
                student.setRegisterNumber(cursor.getString(cursor.getColumnIndex("RegisterNumber")));
                student.setYear(cursor.getString(cursor.getColumnIndex("Year")));
                student.setDepartment(cursor.getString(cursor.getColumnIndex("Department")));
                student.setHosteller(cursor.getString(cursor.getColumnIndex("Hosteller")));
                student.setDayscholar(cursor.getString(cursor.getColumnIndex("Dayscholar")));
                student.setCollegebus(cursor.getString(cursor.getColumnIndex("Collegebus")));
                student.setPrivatebus(cursor.getString(cursor.getColumnIndex("Privatebus")));
                student.setBusnumber(cursor.getString(cursor.getColumnIndex("Busnumber")));
                student.setBoardingplace(cursor.getString(cursor.getColumnIndex("Boardingplace")));
                student.setBusfees(cursor.getString(cursor.getColumnIndex("Busfees")));
                student.setVaccination(cursor.getString(cursor.getColumnIndex("Vaccination")));
                student.setContactnumber(cursor.getString(cursor.getColumnIndex("Contactnumber")));
                student.setCommunicationaddress(cursor.getString(cursor.getColumnIndex("Communicationaddress")));
                result.add(student);
            } while (cursor.moveToNext());
        }
        return result;
    }
}

package com.example.mohit.tourist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mohit on 23/06/2016.
 */
public class DataBase extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "DATABASE";
    public static final String TABLE_NAME = "AGENCIES";
    public static final String COL_1 = "NAME";
    public static final String COL_2 = "ADDRESS";
    public static final String COL_3 = "CONTACT";
    public static final String COL_4 = "WEBSITE";
    String[] names = {"Bhraman Tours & Travels","Rao Travels","Chandigarh Travels","Pack Travel & Tours",
    "Hyderabad Tours & Travels","R V Tours & Travels","Bangalore Tours Travels","Hoysala Tours & Travels"};

    String[] addresses = {"M-14a, Nr. Ambey Inn Hotel, Lajpat Nagar II-Lajpat Nagar, Delhi – 110024",
    "17, Vasant Enclave Market, Vasant Vihar,New Delhi - 110057, INDIA",
    "Chandigarh Main Market India",
    "Pack Travels & Tours (P) Ltd.SCO 15, IInd Floor Sector 17-E Chandigarh - 160017. India",
    "18 - 7 -466 / 2/A/106, Ambhika Nagar, Near Railway Station, Uppuguda, Hyderabad - 500 053",
    "RV Tours & Travels, 12-6-11/4, 3rd Floor Bhagyanagar Complex,Opp-BJP Office,Metro Pillar No-15,Kukatpally,Hyderbad-500072",
    "#37,Shop No.1/32B/09. Jawans Bhawan,West Velli Street, Madurai - 625001",
    "Hoysala Tours & Travels Pvt Ltd #30, 7th B Main Road, 4th Block, Jayanagar, Bangalore - 560 011"};

    String[] contacts = {"1166585098","9971880099","9899941114","172-2702829","9701238500","04040045234",
    "9344552626","08022441763"};

    String[] websites = {"www.bhramantours.co.in","http://www.raotravels.com/","http://www.chandigarhtravels.co.in/",
    "http://www.packtravels.com/","http://www.hyderabadtoursandtravels.com/","http://rvtoursandtravels.in/",
    "http://www.bangaloretourstravels.com","http://www.hoysalatours.com"};

    public DataBase(Context context) {
        super(context,DATABASE_NAME, null, 1);
        SQLiteDatabase sq = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+TABLE_NAME+" (NAME TEXT,ADDRESS TEXT,CONTACT TEXT,WEBSITE TEXT)");
        /*
        for(int i=0;i<8;i++)
        {
            insert(names[i],addresses[i],contacts[i],websites[i]);
        }
        SQLiteDatabase sq = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1,names[0]);
        cv.put(COL_2,addresses[0]);
        cv.put(COL_3,contacts[0]);
        cv.put(COL_4,websites[0]);
        sq.insert(TABLE_NAME,null,cv);*/
    }
    public Cursor fetch()
    {
        for(int i=0;i<8;i++)
        {
            insert(names[i],addresses[i],contacts[i],websites[i]);
        }
        SQLiteDatabase sq = this.getWritableDatabase();
        Cursor c = sq.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        return c;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST "+TABLE_NAME,null);
    }
    public void insert(String name,String address,String contact,String website)
    {
        SQLiteDatabase sq = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1,name);
        cv.put(COL_2,address);
        cv.put(COL_3,contact);
        cv.put(COL_4,website);
        sq.insert(TABLE_NAME,null,cv);
    }
}

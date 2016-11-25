package com.example.administrator.modula;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/11/25.
 */
public class ModularizationActivity extends Activity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modul_activity_main);
        Uri uri = getIntent().getData();
        if(uri != null){
            Log.d(TAG, "Modula: " + uri);
            System.out.println(TAG + "Modula: " + uri);
        }
    }
}

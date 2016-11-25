package com.example.administrator.modularizationapplication;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button mudula_activity_btn;
    PackageManager packageManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        packageManager = getPackageManager();
        mudula_activity_btn = (Button) findViewById(R.id.mudula_activity_btn);
        mudula_activity_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://test:9999/modula"));
                List<ResolveInfo> activities =  packageManager.queryIntentActivities(intent,0);
                if(!activities.isEmpty()){
                    startActivity(intent);
                    Log.d(TAG, "启动成功: " + activities.size());
                    System.out.println(TAG +  "启动成功: " + activities.size());
                }
            }
        });

    }
}

package com.example.thetuition;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

import java.util.HashMap;

public class update extends AppCompatActivity {
    private TextView textCiewCurrentVersion;
    private FirebaseRemoteConfig mFirebaseRemoteConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        textCiewCurrentVersion = findViewById(R.id.textView1);
        textCiewCurrentVersion.setText("Current Version Code:" + getVersionCode());

        HashMap<String, Object> defaultsRate = new HashMap<>();
        defaultsRate.put("new_version_code", String.valueOf(getVersionCode()));

        mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(10)
                .build();
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);
        mFirebaseRemoteConfig.setDefaultsAsync(defaultsRate);

        mFirebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(this, new OnCompleteListener<Boolean>()
        {
            @Override
            public void onComplete(@NonNull Task<Boolean> task)
            {
                if (task.isSuccessful())
                {
                    final String new_version_code = mFirebaseRemoteConfig.getString("new_version_code");
                    if (Integer.parseInt(new_version_code)>getVersionCode())
                        showTheDialog("com.example.thetuition",new_version_code );

                }
            }
        });
    }

    private void showTheDialog(final String appPackageName,String versionFromRemoteConfig)
    {
        final AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("Update")
                .setMessage("This version is absolete, please update to version:" +versionFromRemoteConfig)
                .setPositiveButton("UPDATE", null)
                .show();
        dialog.setCancelable(false);

        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        positiveButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zdz-rF9369qxiwN015akinvct7W7f8Z_/view?usp=drivesdk&h1=en")));
                }
                catch(android.content.ActivityNotFoundException a){

            }

            }
        });
    }



    private PackageInfo pInfo;
    public int getVersionCode()
    {
        pInfo = null;
        try
        {
            pInfo = getPackageManager().getPackageInfo(getPackageName(),0);
        }
        catch(PackageManager.NameNotFoundException e){
            Log.i("MYLOG","NameNotFoundException:"+e.getMessage());
        }
        return pInfo.versionCode;
    }
}
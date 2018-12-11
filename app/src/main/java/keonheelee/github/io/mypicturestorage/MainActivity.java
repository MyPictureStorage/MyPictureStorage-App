package keonheelee.github.io.mypicturestorage;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StrictMode;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

import keonheelee.github.io.mypicturestorage.view.SelectActivity;

public class MainActivity extends AppCompatActivity {
    private String state;
    private static final String DATA_PATH
            = Environment.getExternalStorageDirectory().getAbsolutePath() + "/MypictureStorage";
    private static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        intent = new Intent(getApplicationContext(), SelectActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        checkExternalStorage();

        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            } else {
                ActivityCompat.requestPermissions(MainActivity.this,
                        PERMISSIONS_STORAGE,
                        MY_PERMISSIONS_REQUEST_READ_CONTACTS);
            }
        }

        File dir = new File(DATA_PATH);
        if(!dir.exists()) {
            if(!dir.mkdir()){

            } else {

            }
        }

        Log.i("check",DATA_PATH);
    }


    boolean checkExternalStorage() {
        state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state))
            return true;
        else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state))
            return false;
        else
            return false;
    }
}

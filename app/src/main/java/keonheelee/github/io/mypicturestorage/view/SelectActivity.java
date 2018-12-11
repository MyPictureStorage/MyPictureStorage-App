package keonheelee.github.io.mypicturestorage.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import keonheelee.github.io.mypicturestorage.R;

@SuppressLint("Registered")
public class SelectActivity extends AppCompatActivity implements View.OnClickListener{
    protected Button fileUploadBtn;
    protected Button fileDwonloadBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_main);

        fileDwonloadBtn = (Button) findViewById(R.id.download_mode_btn);
        fileUploadBtn = (Button) findViewById(R.id.upload_mode_btn);

        fileUploadBtn.setOnClickListener(this);
        fileDwonloadBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if(v.getId() == R.id.download_mode_btn){
            intent = new Intent(this, DownloadActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this,
                    "현재 지원되지 않습니다.", Toast.LENGTH_SHORT).show();
            //intent = new Intent(this, UploadActivity.class);
            //startActivity(intent);
        }

    }
}

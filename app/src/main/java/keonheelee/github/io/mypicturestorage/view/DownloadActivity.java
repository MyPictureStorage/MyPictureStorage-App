package keonheelee.github.io.mypicturestorage.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import keonheelee.github.io.mypicturestorage.R;
import keonheelee.github.io.mypicturestorage.request.MainpageRequest;

public class DownloadActivity extends AppCompatActivity {
    protected TextView downloadViewBtn;
    protected TextView downloadStatusBtn;
    protected GridLayout fileViewer;

    protected MainpageRequest mainpageRequest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download_viewer);

        mainpageRequest = new MainpageRequest();

        fileViewer = (GridLayout) findViewById(R.id.download_list);
        downloadViewBtn = (TextView) findViewById(R.id.download_view);
        downloadStatusBtn = (TextView) findViewById(R.id.download_status);
    }

    @Override
    protected void onStart() {
        super.onStart();

        JSONObject result = mainpageRequest.getFileStruct(".");
        try {
            JSONArray dirList = result.getJSONArray("dir");
            for(int i=0; i<dirList.length(); ++i){

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

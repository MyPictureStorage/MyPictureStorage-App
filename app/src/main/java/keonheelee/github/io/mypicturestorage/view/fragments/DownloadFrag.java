package keonheelee.github.io.mypicturestorage.view.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import keonheelee.github.io.mypicturestorage.R;

public class DownloadFrag extends Fragment implements View.OnClickListener{
    protected View view;
    protected TextView downloadView;
    protected TextView downloadStatus;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.download_viewer, container, false);


        return view;
    }

    @Override
    public void onClick(View v) {

    }
}

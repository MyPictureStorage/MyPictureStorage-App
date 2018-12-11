package keonheelee.github.io.mypicturestorage.view.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import keonheelee.github.io.mypicturestorage.R;
import keonheelee.github.io.mypicturestorage.view.events.UploadFileBtnEvent;

public class UploadFrag extends Fragment{
    protected View view;
    protected Button getUploadFileBtn;
    protected ListView uploadStatusList;
    protected Button onUploadBtn;

    protected UploadFileBtnEvent mUploadFileBtnEvent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.upload_fragment, container, false);


        getUploadFileBtn = (Button) view.findViewById(R.id.get_upload_file);
        onUploadBtn = (Button) view.findViewById(R.id.on_upload);
        uploadStatusList = (ListView) view.findViewById(R.id.upload_status_list);

        mUploadFileBtnEvent = new UploadFileBtnEvent();

        getUploadFileBtn.setOnClickListener(mUploadFileBtnEvent);

        return view;
    }
}

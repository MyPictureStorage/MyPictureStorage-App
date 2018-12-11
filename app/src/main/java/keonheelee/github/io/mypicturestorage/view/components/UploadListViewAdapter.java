package keonheelee.github.io.mypicturestorage.view.components;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import keonheelee.github.io.mypicturestorage.R;
import keonheelee.github.io.mypicturestorage.data.UploadInfo;

public class UploadListViewAdapter extends ArrayAdapter<UploadInfo> {
    protected LayoutInflater mInflater = null;
    protected ArrayList<UploadInfo> mArray;

    public UploadListViewAdapter(@NonNull Context context,
                                 int resource, ArrayList<UploadInfo> arrayList) {
        super(context, resource);
        mInflater = LayoutInflater.from(context);
        mArray = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View v, @NonNull ViewGroup parent) {
        UploadInfoViewHolder viewHolder;

        if(v == null){
            v = mInflater.inflate(R.layout.upload_status_component,
                    parent, false);
            viewHolder = new UploadInfoViewHolder();
            viewHolder.txFilename = (TextView)v.findViewById(R.id.upload_file_name);
            viewHolder.txFileSize = (TextView)v.findViewById(R.id.upload_file_size);
            viewHolder.txUploadStatus = (TextView)v.findViewById(R.id.upload_file_status);
        } else
            viewHolder = (UploadInfoViewHolder)v.getTag();

        UploadInfo info = mArray.get(position);
        if(info != null){
            viewHolder.txFilename.setText(info.getFilename());
            viewHolder.txFilename.setText(String.valueOf(info.getFileSize()));
            viewHolder.txUploadStatus.setText(String.valueOf(info.getUploadStatus()));
        }

        return v;
    }
}

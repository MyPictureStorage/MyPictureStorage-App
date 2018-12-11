package keonheelee.github.io.mypicturestorage.data;

public class UploadInfo {
    private String filename;
    private int fileSize;
    private int uploadedSize;
    private double uploadStatus;

    public UploadInfo(String filename, int fileSize){
        this.filename = filename;
        this.fileSize = fileSize;
        this.uploadStatus = 0.0;
    }

    public String getFilename() {
        return filename;
    }

    public int getFileSize(){
        return fileSize;
    }

    public double getUploadStatus(){
        return uploadStatus;
    }

    public void adduploadedSize(int uploadedSize){
        this.uploadedSize += uploadedSize;
        this.uploadStatus = (double)this.uploadedSize / this.fileSize * 100;
    }
}

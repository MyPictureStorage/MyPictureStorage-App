package keonheelee.github.io.mypicturestorage.data;

public class ServerURL {
    final public String HOST_IP = "127.0.0.1";
    final public String FRONT_PORT = "3000";
    final public String STREAM_PORT = "3001";

    final public String URL = this.HOST_IP + ":" + FRONT_PORT;
    final public String DOWNLOAD_URL = this.URL;
    final public String UPLOAD_URL = this.URL + "/upload";

    final public String STREAM_URL = this.HOST_IP + ":" + STREAM_PORT;

}

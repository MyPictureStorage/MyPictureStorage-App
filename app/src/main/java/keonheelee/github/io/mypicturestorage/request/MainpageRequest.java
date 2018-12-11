package keonheelee.github.io.mypicturestorage.request;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import keonheelee.github.io.mypicturestorage.data.ServerURL;

public class MainpageRequest {
    final ServerURL SERVER_URL;

    public MainpageRequest(){
        SERVER_URL = new ServerURL();
    }

    public JSONObject getFileStruct(String path){
        JSONObject pathList = null;
        try{
            URL url = new URL(SERVER_URL.DOWNLOAD_URL + "/" + path);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            conn.setDoInput(true);

            InputStream is = conn.getInputStream();
            StringBuilder sb = new StringBuilder();
            BufferedReader br= new BufferedReader(
                    new InputStreamReader(is, "UTF-8"));

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line+ "\n");
            }

            pathList = new JSONObject(sb.toString());

        }catch(MalformedURLException | ProtocolException exception) {
            exception.printStackTrace();
        }catch(IOException io){
            io.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return pathList;
    }
}

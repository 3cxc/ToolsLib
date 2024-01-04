package com.github.toolslib.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 提供网络功能
 */
final public class HttpClient {

    /**
     * 从URL获取内容并输出
     * <p>
     * 用于更新检测
     * @param url 远程URL
     */
    public static String getHttpContent(String url)throws Exception{
        //使用流从URL获取内容
        StringBuilder buffer = new StringBuilder();
        URL u = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) u.openConnection();
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                buffer.append(line);
            }
        }
        //返回
        if (!buffer.toString().equals(" ") & !buffer.toString().isEmpty()){
            return buffer.toString();
        }
        return null;
    }
}

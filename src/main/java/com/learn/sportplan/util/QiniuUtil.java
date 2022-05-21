package com.learn.sportplan.util;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
@Component
public class QiniuUtil {
    public static String accessKey = "l1OK5qfoih4qFO39GovgIhmcA2RgrTX0gJloCxHw";
    public static String secretKey = "V42qY_ZxGuvN4Unr008l8sy3phj1fkNOc8Sw0DRH";
    public static String bucket = "sportplan-foodimage";

    // 传本地文件
    public static String uploadQiniu(String filePath, String filename){
        Configuration cfg = new Configuration(Region.region2());
        UploadManager uploadManager = new UploadManager(cfg);
//        String key = filename;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try{
            Response response = uploadManager.put(filePath, filename, upToken);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            return putRet.key;
        }catch (QiniuException ex){
            Response r = ex.response;
            try{
                System.err.println(r.bodyStream());
            }catch (QiniuException ex2){
                System.err.println();
            }
            return null;
        }
    }

    public static String uploadQiniu(byte[] bytes, String filename){
        Configuration cfg = new Configuration(Region.region2());
        UploadManager uploadManager = new UploadManager(cfg);
//        String key = filename;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try{
            Response response = uploadManager.put(bytes, filename, upToken);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            return putRet.key;
        }catch (QiniuException ex){
            Response r = ex.response;
            try{
                System.err.println(r.bodyStream());
            }catch (QiniuException ex2){
                System.err.println();
            }
            return null;
        }
    }

    public static String uploadQiniu(FileInputStream inputStream, String filename){
        Configuration cfg = new Configuration(Region.region2());
        UploadManager uploadManager = new UploadManager(cfg);
//        String key = filename;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try{
            Response response = uploadManager.put(inputStream, filename, upToken, null, null);
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
            return putRet.key;
        }catch (QiniuException ex){
            Response r = ex.response;
            try{
                System.err.println(r.bodyStream());
            }catch (QiniuException ex2){
                System.err.println();
            }
            return null;
        }
    }

    public static void deleteFileFromQiniu(String filename){
        // 构造一个带Region对象的配置类
        Configuration cfg = new Configuration(Region.region2());
        Auth auth = Auth.create(accessKey, secretKey);
        BucketManager bucketManager = new BucketManager(auth, cfg);
        try {
            bucketManager.delete(bucket, filename);
        }catch (QiniuException ex){
            System.err.println(ex.code());
            System.err.println(ex.response.toString());
        }
    }
}

package com.jwen.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Jw on 2017/5/15.
 */


public class FileUpload extends ActionSupport{

    private File myFile;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String fileName;
    private String fileType;
    //临时文件夹
    private String destPath;

    public String excute() {

        destPath = "E:/work/tempFile";
        try{
            System.out.println("Src File name: " + myFile);
            System.out.println("Dst File name: " + fileName);

            File destFile  = new File(destPath, fileName);
            FileUtils.copyFile(myFile, destFile);

/*
            FileInputStream fi = new FileInputStream();
*/



        }catch(IOException e){
            e.printStackTrace();
            return ERROR;
        }finally {

        }

        return  SUCCESS;
    }

}

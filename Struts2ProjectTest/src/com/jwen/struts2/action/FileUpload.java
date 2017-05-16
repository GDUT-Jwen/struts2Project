package com.jwen.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Jw on 2017/5/15.
 *
 */


public class FileUpload extends ActionSupport{

    private File myFile;
    private String myFileFileName;
    private String myFileContentType;
    //临时文件夹
    private String destPath;

    public String execute() {

        destPath = "E:/work/tempFile";
        try{
            System.out.println("Src File name: " + myFile);
            System.out.println("Dst File name: " + myFileFileName);

            File destFile  = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);

            destFile.createNewFile();

        }catch(IOException e){
            e.printStackTrace();
            return ERROR;
        }finally {

        }

        return  SUCCESS;
    }

    public File getMyFile() {
        return myFile;
    }
    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }
    public String getMyFileContentType() {
        return myFileContentType;
    }
    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }
    public String getMyFileFileName() {
        return myFileFileName;
    }
    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

}

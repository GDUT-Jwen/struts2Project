package com.jwen.struts2.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Jw on 2017/5/15.
 *
 */

public class FileUpload extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2123495733629679038L;
	private File myFile;
	private String myFileFileName;
	private String myFileContentType;
	// 临时文件夹
	private String destPath;

	public String execute() {

		destPath = "E:\\work\\tempFile\\";
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(myFile);
			os = new FileOutputStream(destPath+myFileFileName); // 文件的写入路径
			byte buffer[] = new byte[1024];
			int count = 0;
			while ((count = is.read(buffer)) > 0) {
				os.write(buffer, 0, count);
			}
			os.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		} finally {
			
		}

		return SUCCESS;
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

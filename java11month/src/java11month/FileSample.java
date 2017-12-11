package java11month;

import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		FileSample sample = new FileSample();
		String	pathName="C:\\Users\\user\\Desktop";
		sample.checkPath(pathName);
		sample.makedir(pathName);
	}

	public void checkPath(String pathName) {
		// TODO Auto-generated method stub
		File file = new File(pathName);
		System.out.println(pathName+"is exitst? =" +file.exists());
	}
	
	public void makedir(String pathName) {
		File file =new File(pathName);
		System.out.println("Make"+pathName+"result="+file.mkdir());
	}
	public void chechFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName+"is directory? ="+file.isDirectory());
		System.out.println(pathName+"is file? ="+file.isFile());
		System.out.println(pathName+"is hidden? ="+file.isHidden());
	}
	public void canFileMethods(String pathName) {
		File file = new File(pathName);
		System.out.println(pathName+"can read="+file.canRead());
	}
}

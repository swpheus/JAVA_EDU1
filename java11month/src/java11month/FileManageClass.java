package java11month;

import java.io.File;
import java.io.IOException;

public class FileManageClass {
	public static void main(String[] args) {
		FileManageClass sample =new FileManageClass();
		String pathName = File.separator+"godofjava"+File.separator+"text";
		String fileName="text.txt";
		sample.checkFile(pathName,fileName);
	}

	public void checkFile(String pathName, String fileName) {
		// TODO Auto-generated method stub
		File file =new File(pathName,fileName);
		try {
			System.out.println("Create result =" + file.createNewFile());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private void getFileInfo(File file) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Absolute path ="+file.getAbsolutePath());
		System.out.println("Absolute file=" +file.getAbsoluteFile());
		System.out.println("Absolute file=" +file.getCanonicalPath());
		System.out.println("Absolute file=" +file.getCanonicalFile());
		

	}
}

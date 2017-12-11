package java11month;

import java.io.File;

public class FileFilterSample {
	public static void main(String[] args) {
		FileFilterSample sample = new FileFilterSample();
		String pathName = "C:"+File.separator+"godofjava"+File.separator+"text";
		sample.checkList(pathName);
	}

	public void checkList(String pathName) {
		// TODO Auto-generated method stub
		File file;
		try {
			file=new File(pathName);
			File[]mainFileList=file.listFiles();
			for(File tempFile:mainFileList) {
				System.out.println(tempFile.getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

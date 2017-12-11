package java11month;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter {

	@Override
	public boolean accept(File file) {
		// TODO Auto-generated method stub
		if(file.isFile()) {
			String fileName= file.getName();
			if(fileName.endsWith(".jpg")) return true;
		}
		return false;
	}

}

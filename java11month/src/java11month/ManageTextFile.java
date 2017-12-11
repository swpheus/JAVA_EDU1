package java11month;
import static java.io.File.separator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JPopupMenu.Separator;

public class ManageTextFile {
	public static void main(String[] args) {
		ManageTextFile manage = new ManageTextFile();
		int numberCount=10;
		String fullpath="c:"+separator+"users"+separator+"user"+separator+"Desktop"+separator+"html.txt";
		manage.writeFile(fullpath,numberCount);
	}

	public void writeFile(String filename, int numberCount) {
		// TODO Auto-generated method stub
		FileWriter fireWriter=null;
		BufferedWriter bufferedWriter=null;
		try {
			fireWriter = new FileWriter(filename);
			bufferedWriter =new BufferedWriter(fireWriter);
			for(int loop=0; loop<=numberCount;loop++) {
				bufferedWriter.write(Integer.toString(loop));
				bufferedWriter.newLine();
			}
			
			System.out.println("write success !!!");
			
		} catch (Exception ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
		
	}
	public void readFile(String fileName) {
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		
		
	}
}

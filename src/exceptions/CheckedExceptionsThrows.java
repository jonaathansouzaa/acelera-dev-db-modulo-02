package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsThrows {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/users/jsouzajava/workspaces/pessoas.txt");
		FileReader fileReader = new FileReader(file);
	}
	
}

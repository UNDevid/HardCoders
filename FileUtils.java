import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {

	public static void read_file(String path) throws IOException{
		File file = new File(path);
		Scanner s = new Scanner(file);
		
		String line = s.next();
		
		s.close();
	}


	public static void write_file(String path) throws IOException{
		FileWriter w = new FileWriter(path);
		w.write("TODO");
		w.close();
	}

}

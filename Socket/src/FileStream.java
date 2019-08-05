import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Filepath = "/Users/joon/Downloads/sample.mp4";
		
		try {
			FileInputStream is = new FileInputStream(Filepath);
			System.out.println(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

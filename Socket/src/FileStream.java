import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Filepath = "/Users/joon/Downloads/sample.mp4";
		
		try {
			// Constructor 생성 
			FileInputStream is = new FileInputStream(Filepath);
			
			byte[] readData = is.readNBytes(3000);
			
			for (byte b : readData) {
				System.out.println(b);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

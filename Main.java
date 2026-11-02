import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello from Lark.");
		File scoreFile = new File("scores.txt");
		Scanner input = new Scanner(scoreFile);
		int total = 0;
		int count = 0;
		int highScore = 0;
		String highPlayer = "";
		
		while (input.hasNextLine()) {
			
		}
    }
}

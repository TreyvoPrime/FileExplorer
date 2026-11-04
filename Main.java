import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello from Lark.");
		File scoreFile = new File("src/scores.txt");
		Scanner input = new Scanner(scoreFile);
		int total = 0;
		int count = 0;
		int highScore = 0;
		int lowScore = 100000000;
		String lowPlayer = "";
		String highPlayer = "";
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			String[] parts = line.split(",");
			String game = parts[0];
			String player = parts[1];
			int score = Integer.parseInt(parts[2]);
			System.out.println("Here is" + player +  "' s score on" + game + ": " +  score);
			total += score;
			count++;
			if (score > highScore) {
				highScore = score;
				highPlayer = player;
			}
			if (score < lowScore) {
				lowScore = score;
				lowPlayer = player;
			}
		}
		input.close();
		System.out.println();
		System.out.println("Our class has an average of " + total/count + " per player");
		
    }
}

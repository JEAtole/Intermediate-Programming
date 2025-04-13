import java.io.*;
import java.util.Scanner;

public class OutputFile {
	
	public void print() throws FileNotFoundException {

		File file = new File("src/SampleText.txt");
		int wordCount = 0;

		// Count the words in the input file
		try (Scanner scanner = new Scanner(new FileReader(file))) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine().trim();
				if (!line.isEmpty()) {
					String[] words = line.split("\\s+"); // split by whitespace
					wordCount += words.length;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Write file info and word count to output file
		try (PrintWriter output = new PrintWriter("src/SampleOutputText.txt")) {
			output.println("Length: " + file.length());
			output.println("Path: " + file.getAbsolutePath());
			output.println("Number of Words: " + wordCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
}

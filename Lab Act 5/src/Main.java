import java.io.*;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {

		OutputFile outputFile = new OutputFile();

		// Read and display content before writing
		System.out.println("File content before writing:");
		readFile("src/SampleText.txt");

		outputFile.print();

		// Overwrite file with new content
		String content = "This little light of mine, I’m gonna let it shine";
		writeToFile("src/SampleText.txt", content);

		// Read and display content after writing
		System.out.println("\nFile content after writing:");
		readFile("src/SampleText.txt");

		outputFile.print(); // Custom print again

	}

	public static void readFile(String filePath) {
		try (Scanner inputFile = new Scanner(new FileReader(filePath))) {
			while (inputFile.hasNextLine()) {
				System.out.println(inputFile.nextLine());
			}
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}

	public static void writeToFile(String filePath, String content) {
		try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath))) {
			br.write(content);
		} catch (IOException e) {
			System.err.println("Error writing to the file: " + e.getMessage());
		}
	}

}

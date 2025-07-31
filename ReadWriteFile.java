package Java2025.Files;

import java.io.*;

public class ReadWriteFile {

    public static void main(String[] args) {

        String inputFile = "src/Java2025/Files/input.txt";
        String outputFile = "src/Java2025/Files/output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Data copied..");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

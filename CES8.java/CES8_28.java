import java.io.*;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null;

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String trimmedLine = line.trim();

                if (!trimmedLine.isEmpty()) {
                    String[] wordArray = trimmedLine.split("\\s+");
                    words += wordArray.length;
                }

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        characters++;
                    }
                }
            }

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters (excluding spaces): " + characters);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}

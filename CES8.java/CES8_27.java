import java.io.*;
public class Main {
    public static void main(String[] args) {

        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            bw = new BufferedWriter(new FileWriter("students.txt"));

            bw.write("101 Rahul 85");
            bw.newLine();
            bw.write("102 Amit 78");
            bw.newLine();
            bw.write("103 Sneha 92");
            bw.newLine();

            bw.flush(); 

            System.out.println("Data written to students.txt successfully.\n");

            br = new BufferedReader(new FileReader("students.txt"));

            System.out.println("Student Records:");
            System.out.println("-----------------");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}

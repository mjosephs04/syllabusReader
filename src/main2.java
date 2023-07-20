import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.*;


public class main2 {
    public static void main2(String[] args) throws FileNotFoundException{
        String fileName = "/Users/markjosephs/IdeaProjects/syllabusReader/syllabus.txt";

        File syll = new File(fileName);
        Scanner sc = new Scanner(syll);

        int numLines = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
            numLines++;
        }

        System.out.println(numLines);
    }

}

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    private static HashTable myHashTable;

    public static void main(String[] args) {
        checkFilePrintWriter();
        checkScanner();

        myHashTable = new HashTable();

        String in;

        while (scan.hasNextLine()) {
            in = scan.nextLine();
            char charArray[] = in.toCharArray();
            Arrays.sort(charArray);
//            myHashTable.add(Arrays.toString(charArray));
        }


    }

    public static File out = new File("output.txt");
    /**
     * the scanner used to scan the input file.
     */
    public static Scanner scan = null;
    /**
     * a printwriter object that is used to print to the output file.
     */
    public static PrintWriter printWriter = null;
    /**
     * the filewriter object that is used to print to the output file.
     */
    public static FileWriter fileWriter;

    /**
     * Checks the File and Print writer objects. Will throw an exception if the file is not found.
     */
    private static void checkFilePrintWriter() {
        try {
            fileWriter = new FileWriter(out);
            printWriter = new PrintWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Checks the scanner object. Will throw an exception if the input file is not found.
     */
    private static void checkScanner(){
        try {
            scan = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}




package Streams;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        Scanner sc = null;
        FileOutputStream fos = null;
        sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        try {
            fos = new FileOutputStream("E:/Sample.tst.txt");
            byte buffer[] = new byte[100];
            buffer = name.getBytes();
            fos.write(buffer);
            System.out.println("details successfully " + "written to the file");
        } catch (FileNotFoundException fileNotFound) {
            fileNotFound.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}
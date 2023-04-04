package Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("E:/character.txt");
            br = new BufferedReader(fr);
            String n = null;
            System.out.println("data is taken from file "+ "to the buffer is ");
            while((n=br.readLine()) != null){
                System.out.println(n);
            }
        }
        catch(FileNotFoundException fileNotFound){
            fileNotFound.printStackTrace();

        }catch(IOException ie){
            ie.printStackTrace();
        }
        finally {
            try{
                fr.close();
                br.close();
            }catch(IOException ie){
                ie.printStackTrace();
            }
        }
    }
}

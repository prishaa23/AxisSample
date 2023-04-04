package Streams;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterReader {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("E:/character.txt");
            int p;
            while ((p = fr.read()) != -1) {
                System.out.println((char) p);
            }
        }
            catch(FileNotFoundException fileNotFound){
                fileNotFound.printStackTrace();

            }catch(IOException ie){
                ie.printStackTrace();
            }
            finally{
                try {
                    fr.close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }



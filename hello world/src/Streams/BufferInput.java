package Streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInput {
    public static void main(String[] args) {
        FileInputStream fs = null;
        BufferedInputStream bs = null;
        try {
            fs = new FileInputStream("E:/Sample.tst.txt");
            bs = new BufferedInputStream(fs);
            byte[] contents = new byte[1024];
            int byteRead = 0;
            String strFileContents;
            while ((byteRead = bs.read(contents)) != -1) {
                strFileContents = new String(contents, 0, byteRead);
                System.out.println("The content of the file used " + "BufferedInputSream is : " + strFileContents);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        } finally {
            try {
                bs.close();
            } catch (IOException ie) {
                ie.printStackTrace();
            }
        }
    }
}

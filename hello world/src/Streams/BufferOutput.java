package Streams;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.util.Scanner;
public class BufferOutput{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter employee id : " );
        int e_id = sc.nextInt();
        System.out.println("Enter employee name : " );
        String ename = sc.next();
        String finalValue = "Welcome " + ename + ", your Employee Id is "+ e_id;
        try {
            fos = new FileOutputStream("E:/Sample.tst.txt");
            bos = new BufferedOutputStream(fos);
            bos.write(finalValue.getBytes());
            System.out.println("Data is written into this file");
        }catch (IOException ie) {
            ie.printStackTrace();
        }finally{
            {
                try {
                    bos.flush();
                    bos.close();
                    fos.close();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
        }
        }
    }
}
package Serializable;

import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;



public class SerializableEx {
    public static void main(String[] args) {
        try{
            EmployeeEx e = new EmployeeEx(11,"Prasanthi",34000);
            System.out.println("Employee before serialization : "+e);
            FileOutputStream fos = new FileOutputStream("E:/Sample.tst.txt");
            ObjectOutputStream os = new ObjectOutputStream((fos));
            os.writeObject(e);
            os.flush();
            os.close();
        }catch(IOException ie) {
            ie.printStackTrace();
        }
        try{
            EmployeeEx e;
            FileInputStream fis = new FileInputStream("E:/Sample.tst.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            e = (EmployeeEx) ois.readObject();
            ois.close();
            System.out.println("Employee after serialization : "+e);
        }catch (IOException ie) {
            ie.printStackTrace();
        }catch (ClassNotFoundException ce){
            ce.printStackTrace();
        }

    }
}

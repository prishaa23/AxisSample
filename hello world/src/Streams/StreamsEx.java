package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamsEx {
    public static void main(String[] args) {
        StringBuffer content = null;
        FileInputStream fs = null;
        int n; int vowel=0; int space=0;
        int flag=0;
        try{
            fs = new FileInputStream("E:/Sample.tst.txt");
            content = new StringBuffer();
            while ((n=fs.read())!= -1){
                content.append ((char)n);
                if(n=='a'|| n=='e'||n=='i'||n=='o'||n=='u')
                  vowel++;
                if(n== ' ')
                    space++;
            }

        }catch (FileNotFoundException fileNotFound){
            fileNotFound.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }finally{
            try{
                System.out.println(content);
                System.out.println("no.of vowels: "+vowel);
                System.out.println("no.of spaces: "+space);
                fs.close();
            }catch(IOException ie){
                ie.printStackTrace();
            }
        }
    }
}

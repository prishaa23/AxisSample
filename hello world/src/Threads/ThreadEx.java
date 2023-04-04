package Threads;
import java.lang.Thread;
public class ThreadEx extends Thread {
    public void run(){
        for (int i=0;i<11;i++){
        System.out.println(Thread.currentThread().getName() +i);
    }
        for (int j=10;j<21;j++){
            System.out.println(Thread.MAX_PRIORITY +j+"\n");
        }
        for (int k=10;k<21;k++){
            System.out.println(Thread.MIN_PRIORITY +k);
        }

        try{
            Thread.sleep(100);
        }catch(InterruptedException i){
            throw new RuntimeException(i);
        }
    }

}

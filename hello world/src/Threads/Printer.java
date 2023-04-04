package Threads;

 class Storage {
    private int value;

    public synchronized void setValue(int value) {
        this.value = value;
    }
    public  synchronized int getValue() {
        return value;
    }
}
 class Counter extends Thread {
     private Storage storage;

     public Counter(Storage storage) {
         this.storage = storage;
     }

     public void run() {
         for (int i = 0; i < 5; i++)
             storage.setValue(i);
         try {
             Thread.sleep(1000); // sleep for 1 second
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

    }
public class Printer extends Thread {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    public void run() {
        while (true) {
            int value = storage.getValue();
            System.out.println("Value: " + value);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


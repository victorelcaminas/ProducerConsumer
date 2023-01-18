import java.util.*;

public class Producer implements Runnable {

    public static final long WAIT_MILLISECONDS = 500;
    private List<String> list;

    public Producer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        long counter = 0;
        try {
           while (true) {

               if (list.size()<10) {
                   list.add("String numer " + counter);
                   counter++;
               }

               Thread.sleep(Producer.WAIT_MILLISECONDS);
           }
        } catch (InterruptedException ex) {

        }
    }
}

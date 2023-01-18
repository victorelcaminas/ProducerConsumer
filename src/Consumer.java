import java.util.*;

public class Consumer implements Runnable {

    public static final long WAIT_MILLISECONDS = 1000;
    private List<String> list;

    public Consumer(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (!list.isEmpty()) {
                    String s = list.remove(0);
                    System.out.println(s + " (" + list.size() + " remaining)");
                    Thread.sleep(Consumer.WAIT_MILLISECONDS);
                }
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

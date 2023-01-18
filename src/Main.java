import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}

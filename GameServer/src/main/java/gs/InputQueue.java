package gs;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sergey on 3/14/17.
 */
public class InputQueue {
    private static BlockingQueue<Actions> instance = new LinkedBlockingQueue<>();

    public static BlockingQueue<Actions> getInstance() {
        return instance;
    }
}
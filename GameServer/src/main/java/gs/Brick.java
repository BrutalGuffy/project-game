package gs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicLong;

public class Brick implements Tickable, Positionable {

    private static final Logger log = LogManager.getLogger(Brick.class);

    public static AtomicLong idGen = new AtomicLong();
    private Point position;
    private Long id = idGen.getAndIncrement();

    public Brick(Point position) {

        this.id = id;
        this.position = position;
        log.info("New Brick id={}, position={}", id, position);
    }



    @Override
    public Point getPosition() {
        return this.position;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void tick(long elapsed) {
        log.info("tick {}",elapsed);
    }
}

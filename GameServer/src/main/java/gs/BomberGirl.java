package gs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicLong;

public class BomberGirl implements Movable {

    private static final Logger log = LogManager.getLogger(BomberGirl.class);

    private  int height = 50;
    private int width = 50;

    //private int speed = 5;
    //private int bomb_counter = 1; //на будущее
    //private int bomb_range = 1; //на будущее

    public static AtomicLong idGen = new AtomicLong();
    private Point position;
    private Long id = idGen.getAndIncrement();

    public BomberGirl(Point position) {

        this.id = id;
        this.position = position;
        log.info("New Girl id={}, position={}", id, position);
    }

    @Override
    public Point move(Direction direction, long time) {
        switch (direction) {
            case UP: this.position = new Point(getPosition().getX(), getPosition().getY() + (int)time);
            log.info(this.position);
                break;
            case DOWN: this.position = new Point(getPosition().getX(), getPosition().getY() - (int)time);
                break;
            case RIGHT: this.position = new Point(getPosition().getX() + (int)time, getPosition().getY());
                break;
            case LEFT: this.position = new Point(getPosition().getX() - (int)time, getPosition().getY());
                break;
            case IDLE: this.position = new Point(getPosition().getX(), getPosition().getY());
                break;
            default: break;
        }

        return this.position;
    }

    @Override
    public Point getPosition() {

        return this.position;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public void tick(long elapsed) {

        log.info("tick {}",elapsed);
        //if (System.currentTimeMillis() - lastTimer > 100){
            //tick();
       // }

    }

}
package command.fans;

/**
 * Created by mics on 4/7/16.
 */
public class Fans {
    public static final int SPEED3 = 3;
    public static final int SPEED2 = 2;
    public static final int SPEED1 = 1;
    public static final int SPEED0 = 0;
    private String place;
    int speed;

    public Fans(String place) {
        this.place = place;
    }

    public void turnSpeed3(){
        speed = SPEED3;
        System.out.println("Fans at " + place + ": speed " + speed);
    }

    public void turnSpeed2(){
        speed = SPEED2;
        System.out.println("Fans at " + place + ": speed " + speed);
    }

    public void turnSpeed1(){
        speed = SPEED1;
        System.out.println("Fans at " + place + ": speed " + speed);
    }

    public void turnSpeed0(){
        speed = SPEED0;
        System.out.println("Fans at " + place + ": speed " + speed);
        this.turnOff();
    }

    public void turnOn(){
        System.out.println("Fans: turning On");
    }

    public void turnOff(){
        System.out.println("Fans: turning Off");
    }

    public int getSpeed() {
        return speed;
    }
}

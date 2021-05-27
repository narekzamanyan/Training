public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    private final float kick_distance = 8.0f;
    private final float long_distance = 16.0f;
    private final float short_distance = 5.0f;


    Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static float myAbs(float a, float b) {
        return (a>b)? a-b: b-a;
    }

    public boolean near(Ball ball) {
        return (myAbs(this.x, ball.getX()) < kick_distance);
    }

    public void kick(Ball ball) {
        if(this.near(ball)) {
            if(this.x < ball.getX())
                ball.setXYZ(ball.getX() + long_distance, ball.getY(), ball.getZ());
            else
                ball.setXYZ(ball.getX() - long_distance, ball.getY(), ball.getZ());
        }
        else {
            if(this.x < ball.getX())
                ball.setXYZ(ball.getX() + short_distance, ball.getY(), ball.getZ());
            else
                ball.setXYZ(ball.getX() - short_distance, ball.getY(), ball.getZ());
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

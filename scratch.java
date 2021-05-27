class Scratch {

    // if the player is to the left of the balls along the X axis and kicks the ball, the ball goes to the right along the axis.
    // if the player is to the right of the balls on the X-axis and is hitting the ball, the ball goes to the left on the X-axis.
    // if the distance between the player and the ball is less than 8 points before the kick, the ball goes 16 points out of its position,
    // otherwise the ball goes 5 points out of its position
    // a kick will move the ball only along X axis
    public static void main(String[] args) {
        boolean isNear;

        Ball ball = new Ball(3f, 1f, 1f);

        Player player1 = new Player(1, 1f, 5f);
        Player player2 = new Player(2, 1f, 15f);


        System.out.println(ball);
        player1.kick(ball);

        System.out.println(ball);
        player1.kick(ball);

        System.out.println(ball);
        player1.kick(ball);

        System.out.println(ball);
        player1.kick(ball);

        player1.move(25f, 1f);

        System.out.println(ball);
        player1.kick(ball);

        System.out.println(ball);


    }
}
package balls;

public class TestBall {
    public TestBall() {
    }

    public static void main(String[] args) {
        Ball b1 = new Ball(1000.0D, 1000.0D);
        System.out.println(b1);
        b1.move(879.0D, 154.0D);
        System.out.println(b1);
    }
}
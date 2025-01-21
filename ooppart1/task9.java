public class task9 {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {
        double speed();
    }

    public interface CanFly extends CanMove {
        double speed(CanFly canFly);
    }
}

public class task3 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public static class Human implements CanRun, CanSwim {
        public void run() {

        }

        public void swim() {

        }

    }

    public static class Duck implements CanFly, CanRun, CanSwim {
        public void fly() {

        }

        public void run() {

        }

        public void swim() {

        }

    }

    public static class Penguin implements CanSwim, CanRun {
        public void swim() {

        }

        public void run() {
        }
    }

    public static class Airplane implements CanFly {
        public void fly() {
        }
    }
}

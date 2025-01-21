public class task2 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public static class Dog implements CanMove, CanEat {
        public void move() {
        }

        public void eat() {

        }
    }

    public static class Duck implements CanMove, CanEat, CanFly {
        public void move() {

        }

        public void eat() {

        }

        public void fly() {

        }
    }

    public static class Car implements CanMove {
        public void move() {

        }
    }

    public static class Airplane implements CanMove, CanFly {
        public void move() {
        }

        public void fly() {
        }
    }
}

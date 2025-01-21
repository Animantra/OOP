public class Car1 {
    private String model;
    private int year;
    private String color;

    public void initialize(String model, int year, String color) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Model: " + model + "\nYear: " + year + "\nColor: " + color);
    }

    public static void main(String[] args) {
        Car1 car = new Car1();
        car.initialize("Tayota", 2020, "Gray");
        car.display();
        Car1 car2 = new Car1();
        car2.initialize("Porche", 2022, "Red");
        car2.display();
    }
}

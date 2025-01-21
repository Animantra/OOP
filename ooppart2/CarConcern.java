public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;

    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color="Orange";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color="Orange";
    }
    public void display(){
        System.out.println("Manufacturer: "+manufacturer);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Color: "+color);
    }
    public static void main(String[] args) {
        CarConcern car1 = new CarConcern("Aventador", 2020, "Green");
        car1.display();

        System.out.println();

        CarConcern car2 = new CarConcern("Huracan", 2024);
        car2.display();

        System.out.println();

        CarConcern car3 = new CarConcern("Urus");
        car3.display();
    }
}

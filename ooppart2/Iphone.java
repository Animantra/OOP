public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Iphone)) {
            return false;
        }
        Iphone iphone = (Iphone) obj;
        return this.model.equals(iphone.model) &&
                this.color.equals(iphone.color) &&
                this.price == iphone.price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
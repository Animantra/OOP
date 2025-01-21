public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Restaurant");
        System.out.println("Building type: " + building.type);
        building.initialize("Barbershop");
        System.out.println("Building type: " + building.type);
    }
}
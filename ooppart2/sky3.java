public class sky3 {
    private int floorsCount;
    private String developer;

    public sky3() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public sky3(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        sky3 skyscraper = new sky3 ();
        sky3  skyscraperUnknown = new sky3(50, "Unknown");

        System.out.println("Skyscraper 1: Floors = " + skyscraper.floorsCount +
                ", Developer = " + skyscraper.developer);
        System.out.println("Skyscraper 2: Floors = " + skyscraperUnknown.floorsCount +
                ", Developer = " + skyscraperUnknown.developer);
    }
}

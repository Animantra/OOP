public class skyscraper2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT =
            "Skyscraper is built. The number of floors - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER =
            "Skyscraper is built. Developer - ";
     public skyscraper2() {
         System.out.println(SKYSCRAPER_WAS_BUILD);
     }

     public skyscraper2(int floors) {
         System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
     }

    public skyscraper2(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }

    public static void main(String[] args) {
        skyscraper2 skyscraper = new skyscraper2();
        skyscraper2 skyscraperTower = new skyscraper2(50);
        skyscraper2 skyscraperSkyline = new skyscraper2("JavaRushDevelopment");
    }
}

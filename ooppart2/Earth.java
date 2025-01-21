public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(30370000);
        Antarctica antarctica = new Antarctica(14000000);
        Australia australia = new Australia(8600000);
        Eurasia eurasia = new Eurasia(54000000);
        NorthAmerica northAmerica = new NorthAmerica(24709000);
        SouthAmerica southAmerica = new SouthAmerica(17840000);

        System.out.println("Africa area: " + africa.getArea());
        System.out.println("Antarctica area: " + antarctica.getArea());
        System.out.println("Australia area: " + australia.getArea());
        System.out.println("Eurasia area: " + eurasia.getArea());
        System.out.println("North America area: " + northAmerica.getArea());
        System.out.println("South America area: " + southAmerica.getArea());
    }

    public static class Africa {
        private int area;

        public Africa(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }
    }

    public static class Antarctica {
        private int area;

        public Antarctica(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }
    }

    public static class Australia {
        private int area;

        public Australia(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }
    }

    public static class Eurasia {
        private int area;

        public Eurasia(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }
    }

    public static class NorthAmerica {
        private int area;

        public NorthAmerica(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }
    }

    public static class SouthAmerica {
        private int area;

        public SouthAmerica(int area) {
            this.area = area;
        }

        public int getArea() {
            return area;
        }
    }
}

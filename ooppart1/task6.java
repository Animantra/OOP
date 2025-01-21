public class task6 {
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        screen.onSelect();
        screen.refresh();
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    static class Screen implements Selectable, Updatable {
        public void onSelect() {
            System.out.println("Screen selected");
        }

        public void refresh() {
            System.out.println("Screen refreshed");
        }
    }
}


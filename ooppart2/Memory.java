import java.util.Arrays;
public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, null,
                "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));

    }

    public static void executeDefragmentation(String[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[count] = array[i];
                count++;
            }
        }
        while (count < array.length) {
            array[count] = null;
            count++;
        }
    }
}

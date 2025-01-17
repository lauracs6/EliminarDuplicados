import java.util.HashMap;

public class eliminarDuplicadosHashmapBoolean {
    
    public static int [] distinct(int [] array) {
        HashMap <Integer, Boolean> map = new HashMap <Integer, Boolean> ();
        int count = 0;

        for (int num: array) {
            if (!map.containsKey(num)) {
                map.put(num, true);
                count++;
            }
        }

        int [] result = new int[count];
        int index = 0;

        for (int num: map.keySet()) {
            result[index++] = num;
        }
        return result;
    }

    public static void main (String [] args) {
        int [] array = {1, 1, 2};
        int [] result = distinct(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}

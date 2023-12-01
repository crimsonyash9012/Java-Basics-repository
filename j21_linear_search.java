public class j21_linear_search {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 12, 18, 21, 24, 30};
        int target = 18;

        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Linear Search: Target found at index " + index);
        } else {
            System.out.println("Linear Search: Target not found");
        }
    }
}

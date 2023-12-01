public class j22_binary_search {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 7, 12, 18, 21, 24, 30};
        int target = 18;

        int low = 0;
        int high = sortedArray.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] == target) {
                index = mid;
                break;
            } else if (sortedArray[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Binary Search: Target found at index " + index);
        } else {
            System.out.println("Binary Search: Target not found");
        }
    }
}

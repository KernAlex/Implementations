public class RadixLSD {
    /**
     * Just because I have been thinking about this implementation, I figured I would have a
     * go at it. The first will be based on integers, the next will likely be able to sort
     * objects. This will be a static class that will just take in the list and sort it;
     */
    private static int maxInt;
    public static void sortIntList(int[] unsortedList) {
        findMaxItem(unsortedList);
    }

    /**
     * This is finding the most significant 10ths place,
     * by finding the max size of the list
     * @param list the unsorted list
     */
    private static void findMaxItem(int[] list) {
        Integer max = Integer.MIN_VALUE;
        for (int i : list) {
            max = Math.max(max, i);
        }
        maxInt = max;
    }
}

import java.util.Stack;

public class RadixLSD {
    /**
     * Just because I have been thinking about this implementation, I figured I would have a
     * go at it. The first will be based on integers, the next will likely be able to sort
     * objects. This will be a static class that will just take in the list and sort it;
     */
    private static int maxInt;
    private static int minInt;
    private static Stack<Integer>[] order = new Stack[10];
    public static void sortIntList(int[] unsortedList) {
        findMaxItem(unsortedList);
        for (int i = 0; i < order.length; i++) {
            order[i] = new Stack<>();
        }
        minInt = 10;
        while (maxInt > minInt) {
            sortIn(unsortedList);
            minInt *= 10;
        }
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
        int t = 1;
        while (max != 0) {
            t *= 10;
            max = max / 10;
        }
        maxInt = t * 10;
    }
    /**
     * Sorts the list into the proper bins;
     */
    private static void sortIn(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int x = (list[i] % minInt) / (minInt / 10);
            while (x >= 10) {
                x /= 10;
            }
            order[x].push(list[i]);
        }
        int pointer = list.length - 1;
        for (int i = 9; i >= 0; i--) {
            while (!order[i].isEmpty()) {
                list[pointer] = order[i].pop();
                pointer--;
            }
        }
    }
}

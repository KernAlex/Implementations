public class testDomain {

    public static void main(String[] args) {
        int[] temp = {2, 5, 4, 10003, 12, 9, 6, 1, 11, 3, 8, 10, 7, 0};
        RadixLSD.sortIntList(temp);
        for (int i : temp) {
            System.out.println(i);
        }
    }
}

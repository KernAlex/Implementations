public class testDomain {

    public static void main(String[] args) {
        int[] temp = {2, 5, 4, 9, 1, 3, 8, 0};
        RadixLSD.sortIntList(temp);
        for (int i : temp) {
            System.out.println(i);
        }
    }
}

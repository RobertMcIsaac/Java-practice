public class CalculateSum {

    public static int calculateSum(int number) {
        int total = 0;
        for (int i=1; i<=number; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(10));
    }
}

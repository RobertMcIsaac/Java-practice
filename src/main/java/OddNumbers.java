public class OddNumbers {
    public static String isOdd(int num) {
        if (num % 2 != 0) {
            return num + " is odd";
        } else {
            return num + " is even";
        }
    }

    public static void main(String[] args) {
        System.out.println(isOdd(7));
    }
}

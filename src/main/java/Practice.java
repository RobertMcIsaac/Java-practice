public class Practice {

    public static int addNums(int a, int b) {
        return a + b;
    }

    public static void printName(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        int total = addNums(2, 3);
        System.out.println("Total = " + total);

        System.out.println(addNums(5, 6));

        printName("Rob");
    }
}

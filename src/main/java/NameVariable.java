public class NameVariable {

    public static String greeting(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        String name = "Rob";
        System.out.println(greeting(name));
    }
}

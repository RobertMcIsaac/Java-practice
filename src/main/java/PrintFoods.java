public class PrintFoods {
    public static void printFoods(String[] foodsArray) {
        for (String food : foodsArray) {
            System.out.println(food);
        }
    }

    public static void main(String[] args) {
        String[] foods =
                {"Apple", "Pasta", "Cake"};
        printFoods(foods);
    }
}

public class FizzBuzz {

//    Write a program that loops from 1 to 20 and prints:
//            •	"FizzBuzz" if divisible by 15
//            •	"Fizz" if divisible by 3
//            •	"Buzz" if divisible by 5
//            •	otherwise the number itself

    public static Boolean isDivisibleBy15(int number) {
        return number % 15 == 0;
    }

    public static Boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    public static Boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    public static void main(String[] args) {
        System.out.println("New");
        for (int number=1; number<= 20; number++) {
            if (isDivisibleBy15(number)) {
                System.out.println("FizzBuzz");
            } else if (isDivisibleBy5(number)) {
                System.out.println("Buzz");
            } else if (isDivisibleBy3(number)) {
                System.out.println("Fizz");
            } else {
                System.out.println(number);
            }
        }
    }
}
package seasonchecker.homework;



public class FizzBuzzChecker {

    private static String checkFizz(int number) {
        double result = number % 3.0;
        return result == 0 ? "Fizz" : "No Fizz";
    }

    private static String checkBuzz(int number) {
        double result = number % 5.0;
        return result == 0 ? "Buzz" : "No Buzz";
    }

    public static String checkFizzBuzz(int number) {
        String result = "None";

        if(checkFizz(number) == "Fizz"){
            result = "Fizz";
        }
        if (checkBuzz(number) == "Buzz"){
            result = "Buzz";
        }
        if (checkFizz(number) == "Fizz" && checkBuzz(number) == "Buzz"){
            result = "FizzBuzz";
        }
        return  result;

    }
}

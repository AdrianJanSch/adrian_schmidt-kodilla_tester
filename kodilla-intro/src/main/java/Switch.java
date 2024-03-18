import java.util.Scanner;

public class Switch {
    public Switch() {


    }

    public static String getLetter() {
        Scanner letter = new Scanner(System.in);
        while (true) {
            System.out.println("Tell me first letter of color form :)");
            String firstLetter = letter.nextLine().trim().toUpperCase();
            switch (firstLetter) {
                case "B" -> System.out.println("Blue");
                case "Y" -> System.out.println("Yellow");
                case "R" -> System.out.println("Red");
                case "W" -> System.out.println("White");
                case "P" -> System.out.println("Pink");
                default -> System.out.println("BRO!Choice difrent letter :) ");
            }
            System.out.println();

        }
    }
}

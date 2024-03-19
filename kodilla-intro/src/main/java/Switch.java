import java.util.Scanner;

public class Switch {
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Tell me your name");
            String name = scanner.nextLine().trim().toUpperCase();
            if (name.length() > 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String getLetterSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Tell me first letter of your favorite of color :)");
            String firstLetter = scanner.nextLine().trim().toUpperCase();
            switch (firstLetter) {
                case "B":
                    return "Blue";
                case "Y":
                    return "Yellow";
                case "R":
                    return "Red";
                case "W":
                    return "White";
                case "P":
                    return "Pink";
                default:
                    System.out.println("No no, you have to chose min. one letter. Try again");
            }
        }
    }
}


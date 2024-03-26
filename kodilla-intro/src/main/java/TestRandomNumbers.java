import java.util.Random;

public class TestRandomNumbers {
    public static void main(String[] args) {

        RandomNumbers numbers = new RandomNumbers();

        numbers.getLos(31);

        System.out.println("Maksymalna wylosowana liczba to ... " + numbers.getLosMax() );
        System.out.println("Minimalna wylosowana liczba to ... " + numbers.getLosMin());
        System.out.println("Ilość losowań to .... " + numbers.getIdx());

    }
}


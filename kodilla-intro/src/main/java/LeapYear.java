public class LeapYear {
    public static void main(String[] args){
        int year = 2024;

                if((year%4==0 && year%100!=0) || year%400==0) {
                    System.out.println("Tak " + year + " " + "jest przestępny");
                }else {
            System.out.println("Nie" + " " + year + " " + " jest przestępny");
        }

    }
}

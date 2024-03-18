public class User {
    private String name;
    private int age;

    private String pesel;


    public User(String firstName, int age) {
        name = firstName;
        this.age = age;
    }

    public User(String firstName) {
        name = firstName;
    }
    public User(int age) {
        this.age = age;
    }


    public void setName(String value){
        this.name = value;

    }
    public String getName() {
        return this.name;
    }
    public void setAge(int value){
        this.age = value;

    }
    public int getAge() {
        return this.age;
    }

    public void setPesel(String value){
        if(value == null){
            System.out.println("nie przypisuje ponieważ podałeś wartość pustą!");
            return;
        }
        if(value.length() != 11){
            System.out.println("nie przypisuję, ponieważ nie ma wymaganej liczby cyfr!");
            return;
        }
        this.pesel = value;
    }
    public String getPesel(){
        return this.pesel;
    }
}

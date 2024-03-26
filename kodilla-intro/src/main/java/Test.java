public class Test {
    public static void main(String[] args){
        Grades dziennik = new Grades();
        dziennik.show();
        dziennik.add(1);
        dziennik.add(2);
        dziennik.add(3);
   /*        dziennik.add(1);
        dziennik.add(1);
        dziennik.add(1);
        dziennik.add(1);
        dziennik.add(1);
        dziennik.add(2);*/
        dziennik.show();
        dziennik.total();
   }
}

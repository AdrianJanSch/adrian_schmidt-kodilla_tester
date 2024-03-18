public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1140, 2019);
        System.out.println("Asus UCV");
        System.out.println("Weight of this model is - " + notebook.weight + " g," + " price is -  " + notebook.price + " zł " + " and production year is - " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.chceckYear();
        System.out.println("Final decison is...");
        notebook.notebookInfo();
        System.out.println();


        Notebook heavyNotebook = new Notebook(2000, 2000, 2010);
        System.out.println("Lenovo TSB");
        System.out.println("Weight of this model is - " + heavyNotebook.weight + " g," + " and price is -  " + heavyNotebook.price + " zł" + " and production year is - " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.chceckYear();
        System.out.println("Final decison is...");
        heavyNotebook.notebookInfo();
        System.out.println();

        Notebook oldNotebook = new Notebook(1600, 1100, 2023);
        System.out.println("Asus RXC");
        System.out.println("Weight of this model is - " + oldNotebook.weight + " g," + " and price is -  " + oldNotebook.price + " zł" + " and production year is - " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.chceckYear();
        System.out.println("Final decison is...");
        oldNotebook.notebookInfo();
        System.out.println();


        Notebook jusNotebook = new Notebook(1700, 2700, 2018);
        System.out.println("Toshiba VRC");
        System.out.println("Weight of this model is - " + jusNotebook.weight + " g," + " and price is -  " + jusNotebook.price + " zł" + " and production year is - " + jusNotebook.year);
        jusNotebook.checkPrice();
        jusNotebook.checkWeight();
        jusNotebook.chceckYear();
        System.out.println("Final decison is...");
        jusNotebook.notebookInfo();
        System.out.println();

        Notebook niceNotebook = new Notebook(1000, 1000, 1000);
        System.out.println("MacBook");
        System.out.println("Weight of this model is - " + niceNotebook.weight + " g," + " and price is -  " + niceNotebook.price + " zł" + " and production year is - " + niceNotebook.year);
        niceNotebook.checkPrice();
        niceNotebook.checkWeight();
        niceNotebook.chceckYear();
        System.out.println("Final decison is...");
        niceNotebook.notebookInfo();
        System.out.println();


        Notebook perfectBook = new Notebook(1010, 900, 2022);
        System.out.println("MercedesBook");
        System.out.println("Weight of this model is - " + perfectBook.weight + " g," + " and price is -  " + perfectBook.price + " zł" + " and production year is - " + perfectBook.year);
        perfectBook.checkPrice();
        perfectBook.checkWeight();
        perfectBook.chceckYear();
        System.out.println("Final decison is...");
        perfectBook.notebookInfo();




    }

}

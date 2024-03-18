public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;


    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("This Notebook is very cheap");
        }
        if (this.price > 600 & this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This Notebook is quite expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This Notebook is ultra light ");
        }
        if (this.weight > 600 && this.weight <= 1600) {
            System.out.println("This Notebook is not very heavy");
        } else {
            System.out.println("This Notebook is very heavy");
        }

    }

    public void notebookInfo() {
        if ((this.price > 1 & this.price<=1000) && this.year >= 2020) {
            System.out.println("This Notebook definetly is for you!");
        }
        else if (this.price > 1000 & this.price <= 2000 && this.year <= 2019) {
            System.out.println("This Notebook is a little too expensive and old, but ok!");
        } else {
            System.out.println("This Notebook definetly is for some else! ");
        }
    }

    public void chceckYear() {
        if (this.year > 2022) {
            System.out.println("This Notebook produced recently");
        }
        if (this.year < 2022 & this.year > 2019) {
            System.out.println("This Notebook is not fesh but still good");
        } else {
            System.out.println("This Notebook is old");
        }
    }

}






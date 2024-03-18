public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;

        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void show() {
        if(this.size == 0){
            System.out.println("Nie wprowadziłeś oceny");
            return;
        }
        System.out.println(this.grades[this.size - 1]);

    }
    public void total() {
   /*     int numberGrades = this.size;
        int totalGrades = (this.grades[0]+ this.grades[1]) +  (this.grades[2] + this.grades[3]) + (this.grades[4] + this.grades[5]) + (this.grades[6] + this.grades[7] +this.grades[8]);
        int sum = totalGrades/numberGrades;
        System.out.println(sum);*/
        double sum = 0;
        for(int i = 0; i<this.size; i++){
            sum = sum + this.grades[i];
    //        sum += this.grades[i]; - można tak ułatwić/ skrócić
        }
        System.out.println(sum/this.size);
    }
}


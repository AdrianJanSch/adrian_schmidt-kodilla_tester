import java.util.Random;

public class RandomNumbers {
    private Random rnd;
    private int losMax;
    private int losMin;
    private int idx;

    public RandomNumbers() {
        rnd = new Random();
    }

    public void getLos(int max) {
        int sum = 0;
        this.losMax = -1;
        this.losMin = max + 1;
        idx = 0;
        do {
            int los = rnd.nextInt(max);
            sum = sum + los;
            if (this.losMax < los) {
                this.losMax = los;
            }
            if (this.losMin > los) {
                this.losMin = los;
            }
            idx++;

        } while (sum <= 5000);

    }

    public int getLosMax(){
        return this.losMax;
    }
    public int getLosMin(){
        return this.losMin;
    }
    public int getIdx(){
        return this.idx;
    }

}

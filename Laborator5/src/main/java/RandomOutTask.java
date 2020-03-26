import java.util.Random;

public class RandomOutTask implements Task {

    int randomNumber;

    public RandomOutTask() {
        this.randomNumber = (int) (Math.random() * 100);
    }

    @Override
    public void execute() {
        System.out.println(this.randomNumber);
    }

    public static void main(String[] args) {
        RandomOutTask randomOutTask = new RandomOutTask();
        randomOutTask.execute();
    }

}

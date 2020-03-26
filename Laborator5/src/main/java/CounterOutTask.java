import org.w3c.dom.css.Counter;

public class CounterOutTask implements Task{

    static int global = 0;

    @Override
    public void execute() {
        global++;
        System.out.println(global);
    }

    public static void main(String[] args) {
        CounterOutTask[] counterOutTasks = new CounterOutTask[15];
        for (int i = 0; i < 15; ++i) {
            counterOutTasks[i] = new CounterOutTask();
            counterOutTasks[i].execute();
        }
    }
}

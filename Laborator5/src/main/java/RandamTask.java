public class RandamTask implements Task {

    String msg;

    public RandamTask(String msg) {
        this.msg = msg;
    }

    @Override
    public void execute() {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        RandamTask randamTask = new RandamTask("Salut");
        randamTask.execute();
    }

}

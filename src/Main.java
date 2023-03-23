public class Main {
    public static void main(String[] args) {
        Soiution soiution = new Soiution();
        soiution.enQueue(1);
        soiution.enQueue(2);
        soiution.enQueue(3);
        soiution.enQueue(4);
        soiution.deQueue();
        soiution.displayQueue();
    }
}
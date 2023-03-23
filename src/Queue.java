public class Queue {
  public Node front;
 public Node rear;

    public Queue(Node front, Node real) {
        this.front = front;
        this.rear = real;
    }
    public Queue() {
    }
    public Node getFront() {
        return front;
    }
    public void setFront(Node front) {
        this.front = front;
    }
    public Node getReal() {
        return rear;
    }
    public void setReal(Node real) {
        this.rear = real;
    }
}

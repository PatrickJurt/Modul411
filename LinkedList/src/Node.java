public class Node<T> {

    private T value;
    private Node<T> next;

    public Node(){
    }

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public T setValue(T value) {
        this.value = value;
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public T setNext(Node<T> next) {
        this.next = next;
        if (next == null)return null;
        return next.getValue();
    }
}


public class LinkedList<T>{

    private Node<T> first;

    public Node<T> getLast(){
        if (first == null) return null;
        Node<T> tmp = first;
        while (tmp.getNext() != null){
            tmp = tmp.getNext();
        }
        return tmp;
    }

    public int size(){
        Node<T> tmp = first;
        int count = 0;
        while (tmp != null){
            tmp = tmp.getNext();
            count++;
        }
        return count;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public T add(T value){
        if (first == null) {
            first = new Node<T>(value);
            return value;
        }
        getLast().setNext(new Node<T>(value));
        return value;

    }

    public T remove(){
        if (first == null) return null;
        T value = first.getValue();
        if (first.getNext() == null) {
            first = null;
        }else{
            Node<T> tmp;
            for (tmp = first; tmp.getNext().getNext() != null; tmp = tmp.getNext()){}
            value = tmp.getNext().getValue();
            tmp.setNext(null);
        }
        return value;
    }

    public void clear(){
        first = null;
    }

    public int getIndexOf(T value){
        int count = 0;
        Node<T> tmp = first;
        while (tmp != null){
            if (tmp.getValue().equals(value)){
                return count;
            }
            tmp = tmp.getNext();
            count++;
        }
        return -1;
    }

    public boolean contains(T value){
        return getIndexOf(value) >= 0;
    }

    public boolean add(int place, T value){
        if (size() > place){
            Node<T> tmp = first;
            for (int i = 0; i < place; i++){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node<T>(value, tmp.getNext()));
            return true;
        }
        return false;
    }

    public boolean remove(int place){
        if (place == 0){
            first = first.getNext();
            return true;
        }
        if (place < size()) {
            Node<T> tmp = first;
            for (int i = 0; i < place - 1; i++) {
                tmp = tmp.getNext();
            }
            tmp.setNext(tmp.getNext().getNext());
            return true;
        }
        return false;
    }

    public T get(int index){
        if (index < size()){
            Node<T> tmp = first;
            for (int i = 0; i < index; i++){
                tmp = tmp.getNext();
            }
            return tmp.getValue();
        }
        return null;
    }
}

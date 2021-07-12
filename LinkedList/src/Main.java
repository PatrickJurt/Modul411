public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(0);
        list.remove();
        list.add(0, 10);
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.contains(7));
        System.out.println(list.getIndexOf(7));


        LinkedList l2 = new LinkedList();


        list.compareTo(l2);
    }
}

package collection.arraylist;

public class collectionArrayList <Element> {

    private Node <Element> first;
    private Node <Element> last;

    private int size = 0;

    public void add (Element element) {
        //a method which allows to add elements (nodes) to the ArrayList.
        //but realization of a method "add" is from the LinkedList.
        Node<Element> node;
        if (first == null) {
            node = new Node<>(element, null, null);
            first = node;

        } else {
            node = new Node<>(element, null, last);
            last.next = node;

        }
        last = node;
        size ++;
    }

    public int size (){
        return size;
    }

    public Element get (int index){
        Node <Element> node = first;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node.item;
    }



    public static class Node <Element>{
        //here a static node is created
        Element item;
        Node <Element> next;
        Node <Element> prev;

        public Node (Element item, Node <Element> next, Node <Element> prev){
            //this is a constructor for node.
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

}
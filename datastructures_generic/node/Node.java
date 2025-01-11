package datastructures_generic.node;

public class Node<T> {
    T value;
    Node<T> next;
    public Node(){

        this.value=null;
        this.next=null;
    }

    public Node(T value){
        this.value=value;
        this.next=null;
    }
}

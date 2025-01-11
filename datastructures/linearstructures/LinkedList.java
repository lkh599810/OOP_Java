package datastructures.linearstructures;
import datastructures.linearstructures.node.IntegerNode;
import datastructures.linearstructures.node.Node;

public abstract class LinkedList<T>{
    protected Node<T> head;
    protected int count;
    protected LinkedList(){
        this.head=null;
        this.count=0;
    }

    //methods : getter setter, append,getNode(몇번째) ,delete
    protected int getCount(){
        return this.count;
    }
    protected Node<T> getNode(int index){
        Node<T> currentNode=this.head;
        for(int i=0; i<index;i++){
            currentNode=currentNode.getNext();
        }
        return currentNode;
    }

    protected void appendIntegerNode(Integer value){
        Node<T> newNode=new Node(value);
        if(this.head==null){
            this.head=newNode;
        }
        else{
            Node<T> currentNode=this.head;
            while(currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        this.count++;
    }

    protected void appendStringNode(String value){
        Node<T> newNode=new Node(value);
        if(this.head==null){
            this.head=newNode;
        }
        else{
            Node<T> currentNode=this.head;
            while(currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        this.count++;
    }

    protected void appendCharNode(Character value){
        Node<T> newNode=new Node(value);
        if(this.head==null){
            this.head=newNode;
        }
        else{
            Node<T> currentNode=this.head;
            while(currentNode.getNext()!=null){
                currentNode=currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        this.count++;
    }

    protected T get(int index){
        if(index>this.count || index<0){
            System.out.println("get() ERROR: index out of range");
        }
        Node currentNode=this.head;
//        Node<T> currentNode=this.head;
        for(int i=0; i<index; i++){
            currentNode=currentNode.getNext();
        }
        return (T)currentNode.getValue(); //질문 : (T)안붙이면 안되는 이유?
    }

    protected void deleteNode(int index){
        if(index >= this.count || index < 0){
            System.out.println("deleteNode() ERROR:index out of range");
        }
        else{
            if(index==0){
                Node currentNode=this.head.getNext();
                System.out.println("deleted Value:" + this.head.getValue());
                this.head=currentNode;
                this.count--;
            }
            else{
                Node formerNode = null;
                Node currentNode = this.head;
                for(int i=0; i<index; i++){
                    formerNode = currentNode;
                    currentNode = currentNode.getNext();
                }
                System.out.println("deleted Value:" + currentNode.getValue());
                formerNode.setNext(currentNode.getNext());
                this.count--;
            }
        }
    }

    protected void traverseList(){
        Node currentNode=this.head;
        System.out.print("[ ");
        for(int i=0; i<this.count; i++){
            System.out.print(currentNode.getValue()+" ");
            currentNode=currentNode.getNext();
        }
        System.out.println("]");
    }



//    public static void main(String args[]) {
//        System.out.println("hello");
//        LinkedList linkedList = new LinkedList();
//        linkedList.appendCharNode('a');
//        linkedList.appendIntegerNode(2);
//        linkedList.appendStringNode("hello");
//        linkedList.traverseList();
//        System.out.println(linkedList.get(0));
//        linkedList.deleteNode(2);
//        linkedList.traverseList();
//        linkedList.deleteNode(0);
//        linkedList.traverseList();
//        linkedList.deleteNode(0);
//        linkedList.traverseList();
//    }




}

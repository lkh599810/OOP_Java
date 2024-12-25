package datastructures.linearstructures.node;

public class Node<T> {
    T value;
    Node<T> next;
    public Node(){//질문 : 아래 value넣는 것 말고 기본생성자를 안 만들어주니 자식 클래스에서 에러가 나던데 그러면 부모는 무조건 기본생성자를 하나 만들어줘야하나?
                    // 답 : 상속 부모클래스는 기본생성자를 만들어주어야 한다.
        this.value=null;
        this.next=null;
    }
    public Node(T value){
        this.value=value;
        this.next=null;
    }
    public Node<T> getNext(){
        return this.next;
    }
    public void setNext(Node newNode){
        this.next=newNode;
    }

    public T getValue(){
        return this.value;
    }

}

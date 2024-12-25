package datastructures.linearstructures;

import datastructures.linearstructures.node.Node;

import javax.sound.midi.Soundbank;

public class Stack<T> extends LinkedList{
    public Stack(){
        super();
    }
    public void push(T value){
        if(value.getClass().equals(Integer.class)){
            super.appendIntegerNode((Integer)value);
        }
        else if(value.getClass().equals(String.class)){
            super.appendStringNode((String)value);
        }
        else if(value.getClass().equals(Character.class)){
            super.appendCharNode((Character) value);
        }
    }

    //부모클래스인 LinkedList에는 deleted value라고 나오기 때문에 재정의.
    public void deleteNode(int index){
        if(index >= this.count || index < 0){
            System.out.println("deleteNode() ERROR:index out of range");
        }
        else{
            if(index==0){
                Node currentNode=this.head.getNext();
                System.out.println("pop Value:" +this.head.getValue());
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
                System.out.println("pop Value:" + currentNode.getValue());
                formerNode.setNext(currentNode.getNext());
                this.count--;
            }
        }
    }
    public Object pop(){
        //전체 질문: this.count와 super.count의 차이... 언제 뭘 써야하는지, 어떻게 구별하는지 등
        //전체 질문: public T pop(){}으로 짜니까 Object로 쓰라고 에러남. 제네릭 T와 object의 차이?
        Object objectValue=super.get(super.count-1);
        deleteNode(super.count-1);
        return objectValue;
    }

    public Object top(){
        Object objectValue = super.get(super.count-1);
        return objectValue;
    }

    public void traverseStack(){
        super.traverseList();
    }

    public static void main(String[] args) {
        Stack stack=new Stack(); //질문 : Stack<T> stack 혹은 Stack<T> stack= new Stack<T>();으로 선언 안해줘도 되나요?
        stack.push(1);
        stack.push('c');
        stack.push("String");
        stack.traverseStack();
        System.out.println("top value: "+stack.top());
        stack.pop();
        stack.traverseStack();
        stack.pop();
        stack.traverseStack();
        stack.pop();
        stack.traverseStack();

    }


}

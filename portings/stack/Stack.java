package portings.stack;
import portings.node.GeneralNode;

public class Stack {
    private GeneralNode head;
    private int count;

    public Stack(){
        this.head=null;
        this.count=0;
    }

    public int getCount(){
        return this.count;
    }

    //pop top push
    public void push(int value){
        GeneralNode newGeneralNode =new GeneralNode(value);
        if(this.head==null){
            this.head= newGeneralNode;
        }
        else{
            GeneralNode temp=this.head;
            while(temp.getNext()!=null) temp=temp.getNext();
            temp.setNext(newGeneralNode);
        }
        this.count++;
    }
    public int top(){
        if(this.head==null){
            System.out.println("TOP ERROR : STACK IS EMPTY\n");
            return -1;
        }
        GeneralNode temp=this.head;
        while(temp.getNext()!=null){
            temp=temp.getNext();
        }

        return temp.getValue();
    }
    public int pop(){
        int returnVal;
        GeneralNode temp=this.head;
        if(temp==null){
            System.out.println("POP ERROR: STACK IS EMPTY\n");
            return -1;
        }
        else if(temp.getNext()==null){//count==1
            this.head=null;
            returnVal=temp.getValue();
        }
        else{//count>=2
            while(temp.getNext().getNext()!=null) temp=temp.getNext();
            returnVal=temp.getNext().getValue();
            temp.setNext(null);
        }

        this.count--;
        return returnVal;
    }

    public void traverseStack(){
        System.out.print("[ ");
        GeneralNode temp=this.head;
        for(int i=0;i<this.getCount();i++){
            System.out.print(temp.getValue()+" ");
            temp=temp.getNext();
        }
        System.out.println("]");
    }

}

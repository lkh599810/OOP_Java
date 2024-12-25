package portings.linked_list;

import portings.node.GeneralNode;

public class LinkedList {
    GeneralNode head;
    private int count;
    public LinkedList(){
        this.head=null;
    }
    public int getCount(){
        return this.count;
    }

    public void append(int value){
        GeneralNode newNode=new GeneralNode(value);
        GeneralNode temp=this.head;
        if(temp==null) this.head=newNode;
        else{
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(newNode);
        }
        this.count++;
    }

    public int search(int n){
        int returnVal=-1;
        if(this.head==null){

            System.out.println("SEARCH ERROR: LIST IS EMPTY");
            return returnVal;
        }
        else{
            GeneralNode temp=this.head;
            for(int i=0;i<n-1;i++){
                temp=temp.getNext();
            }
            returnVal=temp.getValue();
        }
        return returnVal;
    }

    public int delete(int n){
        int returnVal=-1;
        if(this.head==null){
            System.out.println("SEARCH ERROR: LIST IS EMPTY");
        }
        else if(this.getCount()==1){
            returnVal=this.head.getValue();
            this.head=null;
        }
        else{
            GeneralNode temp=this.head;
            GeneralNode temp2=this.head;

            for(int i=0;i<n-2;i++){
                temp=temp.getNext();
            }
        }

        this.count--;
        return returnVal;
    }

}

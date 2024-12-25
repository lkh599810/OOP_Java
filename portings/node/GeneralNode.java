package portings.node;

public class GeneralNode{
    int value;
    GeneralNode next;
    public GeneralNode(int value){
        this.value=value;
        this.next=null;
    }

    public GeneralNode getNext(){return this.next;}
    public void setNext(GeneralNode newGeneralNode){this.next= newGeneralNode;}

    public int getValue(){return this.value;}

}



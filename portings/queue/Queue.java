package portings.queue;
import portings.node.GeneralNode;
public class Queue {
    private GeneralNode front;
    private GeneralNode rear;
    int count;

    public Queue(){
        this.front=null;
        this.rear=null;
        this.count=0;
    }

    public int getCount(){return this.count;}
    public int getFront(){
        if(this.front==null){
            System.out.println("Front ERROR: Queue is Empty");
            return -1;
        }
        return this.front.getValue();
    }
    public int getRear(){
        if(this.rear==null){
            System.out.println("Rear ERROR: Queue is Empty");
            return -1;
        }
        return this.rear.getValue();
    }
    public void enQueue(int value){
        GeneralNode newGeneralNode =new GeneralNode(value);
        if(this.front==null){
            this.front= newGeneralNode;
        }
        else{
            GeneralNode temp=this.front;
            for(int i=0;i<this.count-1;i++){
                temp=temp.getNext();
            }
            temp.setNext(newGeneralNode);
        }
        this.rear= newGeneralNode;
        this.count++;
    }
    public void deQueue(){
        if(this.getCount()==0){
            System.out.println("deQueue ERROR: Queue is Empty\n");
            return;
        }
        System.out.println(this.getFront());
        GeneralNode temp=this.front.getNext();
        this.front=temp;
        this.count--;
    }

    public void traverseQueue(){
        System.out.print("[ ");
        GeneralNode temp=this.front;
        for(int i=0;i<this.getCount();i++){
            System.out.print(temp.getValue()+" ");
            temp=temp.getNext();
        }
        System.out.println("]");
    }


}

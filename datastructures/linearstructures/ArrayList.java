package datastructures.linearstructures;

public class ArrayList<T> extends LinkedList<T>{
    public ArrayList(){
        super();
    }





    public static void main(String args[]){
//        ArrayList<T> arrayList=new ArrayList<>(); //ArrayList<T> static 참조 불가 에러나는 이유?
        ArrayList arrayList=new ArrayList<>();
        arrayList.appendCharNode('a');
        arrayList.appendStringNode("String");
        arrayList.appendIntegerNode(1);
        arrayList.traverseList();
        arrayList.deleteNode(0);
        arrayList.traverseList();
        System.out.println("get(): "+arrayList.get(1));

    }
}

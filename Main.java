import java.util.*;
public class Main{

    // linked list creation
    
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void addLast(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public void display(){
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }

    }
   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in); 
    int val = scn.nextInt();
    LinkedList list = new LinkedList();
    list.addLast(val);
    list.display();
    scn.close();


} 
}
package Introductions;
import java.util.*;

class list{
    Node head=null;
    Node tail=null;

    void print(){
        Node current= head;
        if(head==null){
            System.out.println("empty");
        }
        else{
            while(current!=null){
                System.out.println(current.val);
                current=current.next;
            }
        }
    }

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    void insert(int val){
        Node n =new Node(val);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail=n;
            tail.next=n;
        }
        
    }

}
public class linkedlist {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        list n=new list();
        int size=sc.nextInt();
        int[] arr=new int[size];

    }
}
,
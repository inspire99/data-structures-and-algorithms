package geeksforgeeks.linkedlist;
/**
 * https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
 * 
 * 
 * Input: Singly linked list,
 * question: find middle element
 * 
 * Clarifying question:
 * a) What if there are odd number of elements in linked list
 * -- in this case, print middle element
 * 
 * b) what if there are even number of elements in lined list
 * -- in this case, print second element out of 2 middle elements
 * 
 * 
 */
public class FindMiddleLinkedList{

    // head of the linkedlist
    Node head;

    class Node{
        int data;
        Node next;    

        public Node(int item){
            data = item;
            next = null;
        }
    }

    /**
     * push the node before the head
     * 
     * current
     * 
     *  1 -> 2 -> 3
     * 
     *  1 is head.
     * 
     *  now, if i want to push 0, then..
     * 
     *  0's next should be head.
     *  then 0 should become head.
     * 
     * @param item
     */
    void push(int item){

        Node node = new Node(item);
        if(head == null){
            head = node;
        }
        else{
        
            node.next = head;
            head = node;
        }
    }

    // print list
    void print(){
        
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }

    }

    // print middle.
    /**
     * here we will use fast and slow pointer technique.
     * fast will jump twice compared to slow.
     * 
     * @param args
     */
    void printMiddle(){
        Node fast = head;
        Node slow = head;

        if(head !=null){

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        System.out.println("The middle element is"+slow.data);
        }
    

    }


    public static void main(String[] args) {
        FindMiddleLinkedList linkedList = new FindMiddleLinkedList();
        for(int i =5; i>0;i--){
            linkedList.push(i);
            linkedList.print();
            linkedList.printMiddle();
        }

    }


}
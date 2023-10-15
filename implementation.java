package Linkedlist;
public class implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    public static class linkedlist {

        Node head = null;
        Node tail = null;
        static int count;

        public void insertAtEnd(int val) {
            count++;
            Node temp = new Node(val);
            if (head == null) {
               head=temp;
            } else {
                tail.next = temp;

            }
            tail = temp;

        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }


        }

//        int size(){
//            int count=0;
//           Node temp=head;
//           while(temp != null){
//               count++;
//               temp=temp.next;
//           }
//           return count;
//        }
        void insertAtBeginning(int value){
            count++;
            Node temp=new Node(value);
            if(head==null){

                tail=temp;
            }else{
               temp.next=head;

            }
            head=temp;

        }
        void insertRandom(int pos,int val){
            count++;
            Node t=new Node(val);
            Node temp=head;
            if(pos==0){
                insertAtBeginning(val);
                return;

            }
            else if(pos==count){
                insertAtEnd(val);
                return;
            }
            else{

                for(int i=1;i<pos;i++){
                    temp=temp.next;
                }

                t.next=temp.next;
                temp.next=t;

            }

        }
        void getElement(int pos){
            Node temp=head;
            for(int i=1;i<=pos;i++){
                temp=temp.next;

            }
            System.out.println("the element is"+temp.data);
        }
        void deleteAtIndex(int pos){
            count--;
            Node temp=head;
            for(int i=1;i<pos;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.insertAtEnd(6);
            ll.insertAtBeginning(67);
            ll.insertRandom(3,678);
            ll.display();
            System.out.println("size of linkedlist"+ count);
ll.getElement(3);
ll.deleteAtIndex(3);
ll.display();
            System.out.println("size of linkedlist"+ count);


        }
    }
}

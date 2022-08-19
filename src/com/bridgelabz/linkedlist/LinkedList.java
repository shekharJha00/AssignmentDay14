package com.bridgelabz.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }



        public void show() {
            if(head == null){
                System.out.println("Linked list is Empty");
            }
            else{
                Node<T> temp = head;
                while(temp != null){
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }}
    public void add(T data){
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

   // public void append ( T  data ) {
     //   Node<T> newNode1 = new Node(data);
       // if (head == null) {
         //   head = newNode;
        //}else{
          //  tail.next = newNode;
        //}
        //tail = newNode;
   public void insertAtMid(T data)
   {
       // if list is empty
       if (head == null)
           head = new Node(data);
       else {

           Node newNode = new Node(data);

           Node ptr = head;
           int len = 0;


           while (ptr != null) {
               len++;
               ptr = ptr.next;
           }


           int count = ((len % 2) == 0) ? (len / 2) :
                   (len + 1) / 2;
           ptr = head;


           while (count-- > 1)
               ptr = ptr.next;


           newNode.next = ptr.next;
           ptr.next = newNode;
       }
   }  }







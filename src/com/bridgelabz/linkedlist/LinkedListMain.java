package com.bridgelabz.linkedlist;


public class LinkedListMain {
    public static void main(String[] args) {


        LinkedList<Integer> list3 = new LinkedList<>();

        list3.add(56);
        list3.add(70);
        list3.insertAtMid(30);
        list3.show();
        list3.insertAtPos(40,2);
        list3.search(40);
        System.out.println("List before deletion");
        list3.show();
        list3.popAt(2);
        System.out.println("List after deleting 40 ");
        list3.show();
        System.out.println("the size of list is :"+list3.size());





        }
    }

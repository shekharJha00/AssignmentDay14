package com.bridgelabz.linkedlist;


public class LinkedListMain {
    public static void main(String[] args) {


        LinkedList<Integer> list3 = new LinkedList<>();

        list3.add(56);
        list3.add(30);
        list3.add(40);
        list3.add(70);
        System.out.println("list before sorting :");
        list3.show();

         list3.sort();
        System.out.println("list after sorting :");
      list3.show();
    }}






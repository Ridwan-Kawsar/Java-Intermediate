package com.qa.linkedlist;


import java.util.LinkedList;

public class LinkedListTutorial {
  public static void main(String[] args) {
    LinkedList<String> heroes = new LinkedList<String>();
    heroes.add("Captain America");
    heroes.add("Black Panther");
    heroes.add("IronMan");
    heroes.add("Hulk");
    System.out.println(heroes);
    
    heroes.addFirst("Spiderman");
    System.out.println(heroes);
    
    heroes.addLast("Dr. Strange");
    System.out.println(heroes);
    
    heroes.removeFirst();
    System.out.println(heroes);
    
    heroes.removeLast();
    System.out.println(heroes);
    
    System.out.println(heroes.getFirst());
    System.out.println(heroes.getLast());
  }
}
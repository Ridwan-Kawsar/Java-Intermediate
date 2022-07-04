package com.qa.hashset;

import java.util.HashSet;

public class HashSetTutorial {
  public static void main(String[] args) {
    HashSet<String> animals = new HashSet<String>();
    animals.add("cow");
    animals.add("cat");
    animals.add("dog");
    animals.add("tiger");
    animals.add("lion");
    System.out.println(animals);
  }
}
package com.qa.enums;

enum Dimension {
  TWODIMENSION,
  THREEDIMENSION,
  FOURDIMENSION
}

public class enumsTutorial {
  public static void main(String[] args) {
	  Dimension myVar = Dimension.THREEDIMENSION;

    switch(myVar) {
      case TWODIMENSION:
        System.out.println("2D");
        break;
      case THREEDIMENSION:
         System.out.println("3D");
        break;
      case FOURDIMENSION:
        System.out.println("4D");
        break;
    }
  }
}
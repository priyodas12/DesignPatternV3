package tech.java.design.patterns.creational.factoryMethod;

import java.util.Calendar;

//Defines an interface for creating objects but lets subclasses decide which class to instantiate.
public class FactoryMethodExample {

  public static void main(String[] args) {
    Calendar calender = Calendar.getInstance();
    String cal = calender.getCalendarType();
    System.out.println(cal);
  }
}

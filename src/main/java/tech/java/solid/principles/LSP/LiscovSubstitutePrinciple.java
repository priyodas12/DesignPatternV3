package tech.java.solid.principles.LSP;

/*Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.*/

public class LiscovSubstitutePrinciple {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle(10, 20);
    Shape square = new Square(10);

    System.out.printf("rectangle area: %d\n", rectangle.getArea());
    System.out.printf("square area: %d\n", square.getArea());
  }
}



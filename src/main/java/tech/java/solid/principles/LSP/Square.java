package tech.java.solid.principles.LSP;

public class Square extends Shape {

  private int side;

  public Square(int side) {
    this.side = side;
  }

  @Override
  public int getArea() {
    return side * side;
  }

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }
}

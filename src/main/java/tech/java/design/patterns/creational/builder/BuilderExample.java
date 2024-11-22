package tech.java.design.patterns.creational.builder;

public class BuilderExample {

  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    builder.append('a').append(1).append("xyz");

    System.out.println(builder.toString());

    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append('b').append(1).append(true).append("mnc");

    System.out.println(stringBuffer.toString());
  }
}

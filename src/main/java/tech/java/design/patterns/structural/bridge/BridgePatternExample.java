package tech.java.design.patterns.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//The Bridge Pattern decouples abstraction from its implementation, allowing both to vary independently
//The DriverManager acts as a bridge between the client code and the database drivers.
public class BridgePatternExample {

  public static void main(String[] args) {
    String url = "jdbc:h2:mem:testdb"; // Using H2 in-memory database
    String user = "sa";
    String password = "";

    try (Connection connection = DriverManager.getConnection(url, user, password)) {
      Statement statement = connection.createStatement();
      statement.execute("CREATE TABLE example (id INT PRIMARY KEY, name VARCHAR(255))");
      statement.execute("INSERT INTO example VALUES (1, 'Bridge Pattern')");

      ResultSet resultSet = statement.executeQuery("SELECT * FROM example");
      while (resultSet.next()) {
        System.out.println(
            "ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

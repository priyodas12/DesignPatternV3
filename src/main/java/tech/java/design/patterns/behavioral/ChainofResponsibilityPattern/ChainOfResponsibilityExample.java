package tech.java.design.patterns.behavioral.ChainofResponsibilityPattern;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

//The Chain of Responsibility Pattern allows multiple objects to handle a request, passing it along the chain until it is handled.
public class ChainOfResponsibilityExample {

  public static void main(String[] args) {
    Logger logger = Logger.getLogger(ChainOfResponsibilityExample.class.getName());
    logger.setLevel(Level.ALL);

    ConsoleHandler consoleHandler = new ConsoleHandler();
    consoleHandler.setLevel(Level.WARNING);

    logger.addHandler(consoleHandler);

    logger.info("This is an INFO message.");  // Won't print
    logger.warning("This is a WARNING message.");  // Prints
  }
}

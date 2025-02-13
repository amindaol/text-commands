package edu.ntnu.idi.idatt;

import edu.ntnu.idi.idatt.capitalizeCommands.CapitalizeWordsTextCommand;
import edu.ntnu.idi.idatt.replaceCommands.ReplaceTextCommand;
import java.util.Scanner;
import java.util.List;

public class TerminalClient {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter text: ");
    String text = scanner.nextLine();

    Script script = new Script(List.of(
        new ReplaceTextCommand("hello", "hi"),
        new CapitalizeWordsTextCommand()
    ));

    String result = script.execute(text);
    System.out.println("Processed text: " + result);

    scanner.close();
  }
}

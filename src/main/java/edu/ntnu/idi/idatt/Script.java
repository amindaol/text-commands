package edu.ntnu.idi.idatt;

import edu.ntnu.idi.idatt.textCommand.TextCommand;
import java.util.List;

public class Script implements TextCommand {

  private List<TextCommand> commands;

  public Script(List<TextCommand> commands) {
    if (commands == null) {
      throw new IllegalArgumentException("Commands list cannot be null");
    }
    this.commands = commands;
  }

  @Override
  public String execute(String input) {
    if (input == null) {
      throw new IllegalArgumentException("Input text cannot be null");
    }
    String result = input;
    for (TextCommand command : commands) {
      result = command.execute(result);
    }
    return result;
  }
}

package edu.ntnu.idi.idatt.capitalizeCommands;

import edu.ntnu.idi.idatt.textCommand.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      return text;
    }
    return text.substring(0, 1).toUpperCase() + text.substring(1);
  }
}

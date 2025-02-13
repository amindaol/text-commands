package edu.ntnu.idi.idatt.wrapCommands;

import edu.ntnu.idi.idatt.textCommand.TextCommand;

public class WrapTextCommand implements TextCommand {

  private final String opening;
  private final String end;

  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }

  @Override
  public String execute(String text) {
    return opening + text + end;
  }

}

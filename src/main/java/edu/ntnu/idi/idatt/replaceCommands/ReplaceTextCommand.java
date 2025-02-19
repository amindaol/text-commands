package edu.ntnu.idi.idatt.replaceCommands;

import edu.ntnu.idi.idatt.textCommand.TextCommand;

public class ReplaceTextCommand implements TextCommand {

  private final String target;
  private final String replacement;

  public ReplaceTextCommand(String target, String replacement) {
    if (target == null || replacement == null) {
      throw new IllegalArgumentException("Target and replacement cannot be null");
    }
    this.target = target;
    this.replacement = replacement;
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("Input text cannot be null");
    }
    return text.replace(target, replacement);
  }
}

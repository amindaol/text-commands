package edu.ntnu.idi.idatt;

public class ReplaceTextCommand implements TextCommand {

  private final String target;
  private final String replacement;

  public ReplaceTextCommand(String target, String replacement) {
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
    return text.replace(target, replacement);
  }
}

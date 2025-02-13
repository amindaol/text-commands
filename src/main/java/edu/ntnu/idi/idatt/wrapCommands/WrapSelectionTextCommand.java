package edu.ntnu.idi.idatt.wrapCommands;

public class WrapSelectionTextCommand extends WrapTextCommand {

  private final String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    if (!text.contains(selection)) {
      return text;
    }
    return text.replaceFirst(selection, getOpening() + selection + getEnd());
  }
}

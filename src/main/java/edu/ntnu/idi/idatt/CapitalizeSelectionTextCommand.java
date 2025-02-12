package edu.ntnu.idi.idatt;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {

  private final String selection;

  public CapitalizeSelectionTextCommand(String selection) {
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
    String capitalizedSelection = selection.substring(0, 1).toUpperCase() + selection.substring(1);
    return text.replaceAll(selection, capitalizedSelection);
  }
}

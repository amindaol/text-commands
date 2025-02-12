package edu.ntnu.idi.idatt;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    String[] lines = text.split("\n");

    StringBuilder wrappedText = new StringBuilder();
    for (String line : lines) {
      wrappedText.append(getOpening()).append(line).append(getEnd()).append("\n");
    }
    return wrappedText.toString().stripTrailing();
  }

}

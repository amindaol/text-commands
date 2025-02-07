package edu.ntnu.idi.idatt;

public class WrapLinesTextCommand {

  private final String opening;
  private final String end;

  public WrapLinesTextCommand(String opening, String end) {
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

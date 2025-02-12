package edu.ntnu.idi.idatt;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      return text;
    }
    return Arrays.stream(text.split("\\s+"))
        .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
        .collect(Collectors.joining(" "));
  }

}

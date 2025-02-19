package edu.ntnu.idi.idatt;

import edu.ntnu.idi.idatt.wrapCommands.WrapTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.textCommand.TextCommand;


public class WrapTextCommandTest {

  @Test
  void testWrapTextCommand() {
    WrapTextCommand command = new WrapTextCommand("[", "]");
    assertEquals("[hello]", command.execute("hello"));
  }

  @Test
  void testGetOpeningAndEnd() {
    WrapTextCommand command = new WrapTextCommand("(", ")");
    assertEquals("(", command.getOpening());
    assertEquals(")", command.getEnd());
  }
}

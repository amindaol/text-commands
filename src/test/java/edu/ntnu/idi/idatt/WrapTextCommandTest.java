package edu.ntnu.idi.idatt;

import edu.ntnu.idi.idatt.wrapCommands.WrapTextCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

  @Test
  void testWrapTextCommandWithEmptyString() {
    WrapTextCommand command = new WrapTextCommand("<", ">");
    assertEquals("<>", command.execute(""));
  }

  @Test
  void testWrapTextCommandWithWhitespace() {
    WrapTextCommand command = new WrapTextCommand("{", "}");
    assertEquals("{ hello }", command.execute(" hello "));
  }

  @Test
  void testWrapTextCommandWithEscapeSequences() {
    WrapTextCommand command = new WrapTextCommand("\\", "\\");
    assertEquals("\\hello\\", command.execute("hello"));
  }
}

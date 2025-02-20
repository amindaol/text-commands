package edu.ntnu.idi.idatt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.textCommand.TextCommand;

import edu.ntnu.idi.idatt.replaceCommands.ReplaceTextCommand;


public class ReplaceTextCommandTest {

  @Test
  void testReplaceTextCommand() {
    TextCommand cmd = new ReplaceTextCommand("hello", "hi");
    assertEquals("hi world", cmd.execute("hello world"));
  }

  @Test
  void testReplaceTextCommandWithNoMatch() {
    ReplaceTextCommand command = new ReplaceTextCommand("bye", "hi");
    assertEquals("hello world", command.execute("hello world"));
  }

  @Test
  void testReplaceTextCommandWithNull() {
    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new ReplaceTextCommand(null, "hi")
    );
    assertEquals("Target and replacement cannot be null", exception.getMessage());
  }

  @Test
  void testReplaceTextCommandWithEmptyString() {
    ReplaceTextCommand command = new ReplaceTextCommand("hello", "hi");
    assertEquals("", command.execute(""));
  }

  @Test
  void testReplaceTextCommandWithCaseSensitivity() {
    ReplaceTextCommand command = new ReplaceTextCommand("Hello", "Hi");
    assertEquals("Hi world", command.execute("Hello world"));
  }


}

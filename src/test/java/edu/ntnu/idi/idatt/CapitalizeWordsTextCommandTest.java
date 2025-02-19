package edu.ntnu.idi.idatt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.textCommand.TextCommand;

import edu.ntnu.idi.idatt.capitalizeCommands.CapitalizeWordsTextCommand;

public class CapitalizeWordsTextCommandTest {

  @Test
  void testCapitalizeWordsTextCommand() {
    TextCommand cmd = new CapitalizeWordsTextCommand();
    assertEquals("Hello World", cmd.execute("hello world"));
  }
}

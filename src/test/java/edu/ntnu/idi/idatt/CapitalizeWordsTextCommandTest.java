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

  @Test
  void testCapitalizeWordsWithMixedCase() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("HELLO WORLD", command.execute("hELLO wORLD"));
  }

  @Test
  void testCapitalizeWordsWithSpecialCharacters() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("Hello @world!", command.execute("hello @world!"));
  }

  @Test
  void testCapitalizeWordsWithNumbers() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    assertEquals("Hello 123 World", command.execute("hello 123 world"));
  }


}

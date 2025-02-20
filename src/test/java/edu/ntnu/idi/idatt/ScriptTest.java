package edu.ntnu.idi.idatt;

import edu.ntnu.idi.idatt.capitalizeCommands.CapitalizeWordsTextCommand;
import edu.ntnu.idi.idatt.replaceCommands.ReplaceTextCommand;
import edu.ntnu.idi.idatt.wrapCommands.WrapTextCommand;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import edu.ntnu.idi.idatt.Script;

public class ScriptTest {

  @Test
  void testScriptWithMultipleCommands() {
    Script script = new Script(List.of(
        new ReplaceTextCommand("foo", "bar"),
        new CapitalizeWordsTextCommand()
    ));
    assertEquals("Bar Baz", script.execute("foo baz"));
  }

  @Test
  void testScriptWithEmptyString() {
    Script script = new Script(List.of(new CapitalizeWordsTextCommand()));
    assertEquals("", script.execute(""));
  }

  @Test
  void testScriptWithNullText() {
    Script script = new Script(List.of(new CapitalizeWordsTextCommand()));
    Exception exception = assertThrows(IllegalArgumentException.class, () ->
        script.execute(null)
    );
    assertEquals("Input text cannot be null", exception.getMessage());
  }

  @Test
  void testScriptWithNoCommands() {
    Script script = new Script(new ArrayList<>());
    assertEquals("hello world", script.execute("hello world"));
  }

  @Test
  void testScriptWithWrapCommand() {
    Script script = new Script(List.of(new WrapTextCommand("[", "]")));
    assertEquals("[hello]", script.execute("hello"));
  }
}

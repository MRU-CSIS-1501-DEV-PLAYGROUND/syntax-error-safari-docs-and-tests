package drill;

import static org.assertj.core.api.Assertions.assertThat;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DrillUtilTest {

  @Test
  @DisplayName("when you call printPrompt, it should print the expected prompt")
  public void printPrompt_should_print_expected_prompt() throws Exception {
    String EXPECTED_CONSOLE_OUTPUT = "Where would you like to go today? ";

    assertThat(whatShowsInConsoleForPrintPrompt()).isEqualTo(EXPECTED_CONSOLE_OUTPUT);
  }

  @Test
  @DisplayName("when you call printSpacer, it should print two newlines")
  public void printSpacer_should_print_two_newlines() throws Exception {
    String EXPECTED_CONSOLE_OUTPUT = "\n\n";

    assertThat(whatShowsInConsoleForPrintSpacer()).isEqualTo(EXPECTED_CONSOLE_OUTPUT);
  }

  @Test
  @DisplayName("when you call printTopGrosser, it should print the expected movie info")
  public void printTopGrosser_should_print_expected_movie_info() throws Exception {
    String EXPECTED_CONSOLE_OUTPUT = "Top grossing movie of 1988: Rain Man\n";

    assertThat(whatShowsInConsoleForPrintTopGrosser()).isEqualTo(EXPECTED_CONSOLE_OUTPUT);
  }

  @Test
  @DisplayName(
      "when you call printRiddle, it should print the expected riddle with a tabbed answer")
  public void printRiddle_should_print_expected_riddle_with_tabbed_answer() throws Exception {
    String EXPECTED_CONSOLE_OUTPUT = "Q. What did the mermaid wash her fins with?\n\tA. Tide.";

    assertThat(whatShowsInConsoleForPrintRiddle()).isEqualTo(EXPECTED_CONSOLE_OUTPUT);
  }

  private String whatShowsInConsoleForPrintSpacer() throws Exception {
    return tapSystemOutNormalized(
        () -> {
          DrillUtil.printSpacer();
        });
  }

  private String whatShowsInConsoleForPrintPrompt() throws Exception {
    return tapSystemOutNormalized(
        () -> {
          DrillUtil.printPrompt();
        });
  }

  private String whatShowsInConsoleForPrintTopGrosser() throws Exception {
    return tapSystemOutNormalized(
        () -> {
          DrillUtil.printTopGrosser();
        });
  }

  private String whatShowsInConsoleForPrintRiddle() throws Exception {
    return tapSystemOutNormalized(
        () -> {
          DrillUtil.printRiddle();
        });
  }
}

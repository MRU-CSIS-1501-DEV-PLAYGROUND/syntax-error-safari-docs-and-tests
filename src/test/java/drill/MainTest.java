package drill;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

  @Test
  @DisplayName("when you call main, it should print the expected lines")
  public void main_should_print_expected_lines() throws Exception {
    String line1 = "Where would you like to go today? ";
    String line2 = "";
    String line3 = "Top grossing movie of 1988: Rain Man";
    String line4 = "";
    String line5 = "";
    String line6 = "Q. What did the mermaid wash her fins with?";
    String line7 = "\tA. Tide.";

    String EXPECTED_CONSOLE_OUTPUT =
        String.join("\n", line1, line2, line3, line4, line5, line6, line7);

    assertThat(whatShowsInConsoleForMain()).isEqualTo(EXPECTED_CONSOLE_OUTPUT);
  }

  private String whatShowsInConsoleForMain() throws Exception {
    return tapSystemOutNormalized(
        () -> {
          Main.main(new String[0]);
        });
  }
}

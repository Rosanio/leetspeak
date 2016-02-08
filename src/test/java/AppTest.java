import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void isLeetSpeak_forReplaceEWith3_3() {
    App leetspeak = new App();
    assertEquals("33l", App.isLeetSpeak("eel"));
  }

  @Test
  public void isLeetSpeak_forReplaceOWith0_0() {
    App leetspeak = new App();
    assertEquals("0wl", App.isLeetSpeak("owl"));
  }

  @Test
  public void isLeetSpeak_forReplaceIWith1_1() {
    App leetspeak = new App();
    assertEquals("1cing", App.isLeetSpeak("Icing"));
  }

  @Test
  public void isLeetSpeak_forReplaceSWithZ_Z() {
    App leetspeak = new App();
    assertEquals("1 scr3am y0u scr3am w3 all scr3am f0r razpb3rry ic3 cr3am!", App.isLeetSpeak("I scream you scream we all scream for raspberry ice cream!"));
  }
}

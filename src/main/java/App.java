import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static String isLeetSpeak(String word) {
    word = word.replaceAll("e","3");
    word = word.replaceAll("E","3");
    word = word.replaceAll("o", "0");
    word = word.replaceAll("O", "0");
    word = word.replaceAll("I", "1");
    return word;
  }

}

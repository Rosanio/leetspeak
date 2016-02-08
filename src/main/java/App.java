import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    System.out.println(isLeetSpeak("sassy sunshine"));
  }

  public static String isLeetSpeak(String word) {
    String[] wordArray = word.split(" ");
    String newWord = "";
    for(String wordInArray: word.split(" ")){
      wordInArray = wordInArray.replaceAll("e","3");
      wordInArray = wordInArray.replaceAll("E","3");
      wordInArray = wordInArray.replaceAll("o", "0");
      wordInArray = wordInArray.replaceAll("O", "0");
      wordInArray = wordInArray.replaceAll("I", "1");
      if(wordInArray.startsWith("s")) {
        wordInArray = wordInArray.replaceAll("s","z");
        wordInArray = wordInArray.replaceFirst("z","s");
      } else {
        wordInArray = wordInArray.replaceAll("s","z");
      }
      newWord = newWord.concat(" " + wordInArray);
      newWord = newWord.trim();
    }
    // word = word.replaceAll("e","3");
    // word = word.replaceAll("E","3");
    // word = word.replaceAll("o", "0");
    // word = word.replaceAll("O", "0");
    // word = word.replaceAll("I", "1");
    // if(word.startsWith("s")) {
    //   word = word.replaceAll("s","z");
    //   word = word.replaceFirst("z","s");
    // } else {
    //   word = word.replaceAll("s","z");
    // }
    return newWord;
  }

}

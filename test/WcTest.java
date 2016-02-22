import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WcTest{
  String data = "Hey I am very happy\n\t\tHow are you ?\nI am fine and you ?\n";
  @Test
  public void characterCountTest(){
    WordCount myWc = new WordCount(data);
    int value = myWc.characterCount();
    assertEquals(56,value);
  }
  @Test
  public void lineCountTest(){
    WordCount myWc = new WordCount(data);
    int value = myWc.lineCount();
    assertEquals(3,value);
  }
  // @Test
  public void wordCountTest(){
    WordCount myWc = new WordCount(data);
    int value = myWc.wordCount();
    assertEquals(15,value);
  }
}

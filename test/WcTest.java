import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WcTest{
  @Test
  public void characterCountTest(){
    WordCount myWc = new WordCount("text.txt");
    int value = myWc.characterCount();
    assertEquals(910,value);
  }
  @Test
  public void lineCountTest(){
    WordCount myWc = new WordCount("text.txt");
    int value = myWc.lineCount();
    assertEquals(28,value);
  }
  // @Test
  public void wordCountTest(){
    WordCount myWc = new WordCount("text.txt");
    int value = myWc.wordCount();
    assertEquals(117,value);
  }
}

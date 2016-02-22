import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class WcTest{
  String data = "Hey I am very happy\n\t\tHow are you ?\nI am fine and you ?\n";
  @Test
  public void characterCountTest(){
    Wc myWc = new Wc(data);
    int value = myWc.characterCount();
    assertEquals(56,value);
  }
  @Test
  public void lineCountTest(){
    Wc myWc = new Wc(data);
    int value = myWc.lineCount();
    assertEquals(3,value);
  }
  @Test
  public void byteCountTest(){
    Wc myWc = new Wc(data);
    int value = myWc.byteCount();
    assertEquals(56,value);
  }
}

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReadFileTest {
  @Test
  public void filenameShouldGiveTheNameOfTheFile(){
    ReadFile file = new ReadFile("text.txt");
    assertEquals("text.txt",file.filename());
  }
  @Test
  public void readShouldGiveTheContentOfTheFile(){
    ReadFile file = new ReadFile("text.txt");
    String content = "This text file is used for testing wc tools.\n";
    assertEquals(content,file.read());
  }
}

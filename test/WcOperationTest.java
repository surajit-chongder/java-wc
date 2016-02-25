import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WcOperationTest{
  String []arguments = {"-m","todo.txt","method.txt"};
  @Test
  public void filterFileTest(){
    WcOperation a = new WcOperation(arguments);
    String[] value = a.filterFile();
    String[] expected = {"todo.txt","method.txt"};
    assertEquals(expected[0],value[0]);
    assertEquals(expected[1],value[1]);
  }
  @Test
  public void filterCommandTest(){
    WcOperation a = new WcOperation(arguments);
    String[] value = a.filterCommand();
    String[] expected = {"-m"};
    assertEquals(expected[0],value[0]);
  }
  String []data = {"-l","-w","method.txt"};
  @Test
  public void filterCommandTestWhenMultipleCommand(){
    WcOperation a = new WcOperation(data);
    String[] value = a.filterCommand();
    String[] expected = {"-l","-w"};
    assertEquals(expected[0],value[0]);
    assertEquals(expected[1],value[1]);
  }
}

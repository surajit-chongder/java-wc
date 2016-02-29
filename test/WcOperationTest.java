import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WcOperationTest {

    @Test
    public void filterFileTest() {
        String[] arguments = {"-m", "todo.txt", "method.txt"};

        WcOperation a = new WcOperation(arguments);
        String[] value = a.filterFile();
        String[] expected = {"todo.txt", "method.txt"};
        assertEquals(expected[0], value[0]);
        assertEquals(expected[1], value[1]);
    }

    @Test
    public void filterCommandTest() {
        String[] arguments = {"-m", "todo.txt", "method.txt"};

        WcOperation a = new WcOperation(arguments);
        String[] value = a.filterCommand();
        String[] expected = {"-m"};
        assertEquals(expected[0], value[0]);
    }


    @Test
    public void filterCommandTestWhenMultipleCommand() {
        String[] data = {"-l", "-w", "method.txt"};

        WcOperation a = new WcOperation(data);
        String[] value = a.filterCommand();
        String[] expected = {"-l", "-w"};
        assertEquals(expected[0], value[0]);
        assertEquals(expected[1], value[1]);
    }
}

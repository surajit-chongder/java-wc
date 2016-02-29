import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WcTest {
    String data = "Hey I am very happy\n\t\tHow are you ?\nI am fine and you ?\n";

    @Test
    public void characterCountTest() {
        Wc myWc = new Wc(data);
        int value = myWc.characterCount();
        assertEquals(56, value);
    }

    @Test
    public void lineCountTest() {
        Wc myWc = new Wc(data);
        int value = myWc.lineCount();
        assertEquals(3, value);
    }

    @Test
    public void byteCountTest() {
        Wc myWc = new Wc(data);
        int value = myWc.byteCount();
        assertEquals(56, value);
    }

    String testData = "8989 33333 3245 7890543216789054321";

    @Test
    public void lineCount_gives_the_no_of_line_of_the_number_in_the_string() {
        assertEquals(0, new Wc(testData).lineCount());
    }

    @Test
    public void wordCount_gives_the_no_of_the_word_of_the_number_in_the_string() {
        assertEquals(4, new Wc(testData).wordCount());
    }

    @Test
    public void byteCount_gives_the_no_of_character_of_the_number_in_the_string() {
        assertEquals(35, new Wc(testData).byteCount());
    }

    @Test
    public void characterCount_gives_the_byte_count_of_the_number_in_the_string() {
        assertEquals(35, new Wc(testData).characterCount());
    }
}

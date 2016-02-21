import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class WordCount{
  private final String content;

  public WordCount(String filename){
    this.content = this.readFile(filename);
  }

  private String readFile(String filename){
    String content = null;
    File file = new File(filename);
    try {
      FileReader reader = new FileReader(file);
      char[] chars = new char[(int) file.length()];
      reader.read(chars);
      content = new String(chars);
      reader.close();
    }
    catch (IOException err) {
      err.printStackTrace();
    }
    return content;
  }

  public int characterCount(){
    return this.content.length();
  }

  public int lineCount(){
    return this.content.split("\n").length;
  }

  public int wordCount(){
    return this.content.split(" ").length;
  }

  public static void main(String[] args) {
    String file = new String(args[0]);
    WordCount my = new WordCount(file);
    System.out.println(my.characterCount());
    System.out.println(my.lineCount());
    System.out.println(my.wordCount());
  }
}

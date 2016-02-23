import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ReadFile {
  private final String file;

  public ReadFile(String filename){
      this.file = filename;
  }

  public String read(){
    String content = null;
    File file = new File(this.file);
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
  public String filename(){
    return new String(this.file);
  }
}

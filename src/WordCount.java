class WordCount{
  private final String content;

  public WordCount(String contentElement){
    this.content = contentElement;
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
    WordCount my = new WordCount(new ReadFile(file).read());
    System.out.println(my.characterCount());
    System.out.println(my.lineCount());
    System.out.println(my.wordCount());
  }
}

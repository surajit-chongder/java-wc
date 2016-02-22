class Wc{
  private final String content;

  public Wc(String contentElement){
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

  public int byteCount(){
    byte[] contentBytes = this.content.getBytes();
    return contentBytes.length;
  }
}

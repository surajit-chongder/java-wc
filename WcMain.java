class WcMain {
  public static void main(String[] args) {
    WcOperation my = new WcOperation(args);
    String []files = my.filterFile();
    for (int index = 0;index < files.length ;index ++) {
      String fileContent = new ReadFile(files[index]).read();
      String filename = new ReadFile(files[index]).filename();
      Wc each = new Wc(fileContent);
      int lineCount = each.lineCount();
      int wordCount = each.wordCount();
      int characterCount = each.characterCount();
      System.out.println(lineCount+"    "+wordCount+"   "+characterCount+"    "+filename);
    }
  }
}

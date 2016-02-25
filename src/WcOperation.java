class WcOperation {
  private final String[] args;

  public WcOperation(String[] args){
    this.args = args;
  }

  public String[] filterFile(){
    String []filteredFiles = new String[this.args.length];
    for (int count = 0,index = 0; index < this.args.length; index++) {
      if (this.args[index].charAt(0) != '-') {
        filteredFiles[count] = this.args[index];
        count++;
      }
    }
    return filteredFiles;
  }

  public String[] filterCommand(){
    String []filteredCommands = new String[this.args.length];
    for (int count = 0,index = 0; index < this.args.length; index++) {
      if (this.args[index].charAt(0) == '-') {
        filteredCommands[count] = this.args[index];
        count++;
      }
    }
    return filteredCommands;
  }

 private boolean hasCommand(){
   return this.filterCommand()[0] != null;
 }

 private void withoutCommandRepresentation(){
   String []files = this.filterFile();
   int totalLine=0,totalWord=0,totalCharacter=0;
   for (int index = 0;index < files.length ;index ++) {
     String fileContent = new ReadFile(files[index]).read();
     String filename = new ReadFile(files[index]).filename();
     Wc each = new Wc(fileContent);
     totalLine += each.lineCount();
     totalWord += each.wordCount();
     totalCharacter += each.characterCount();
     representationString("\t"+each.lineCount()+"\t\t"+each.wordCount()+"\t\t"+each.characterCount()+" "+filename);
   }
   actionIfMoreThanOneFile(files.length,totalLine,totalWord,totalCharacter);
 }

 private void withCommandRepresentation(){
   String []files = this.filterFile();
   String []commands = this.filterCommand();
   for (int index = 0;files[index] != null ;index ++) {
     String fileContent = new ReadFile(files[index]).read();
     String filename = new ReadFile(files[index]).filename();
     Wc each = new Wc(fileContent);
     for (int commandIndex = 0; commands[commandIndex] != null ; commandIndex++) {
       int result = this.getFunctionalCommandValue(commands[commandIndex],each);
       representationString("\t"+result +"\t"+ filename);
     }
   }
 }

 private void actionIfMoreThanOneFile(int fileLength,int totalLine,int totalWord,int totalCharacter){
   if (fileLength > 1)
     representationString("\t"+totalLine +"\t\t"+ totalWord +"\t\t"+ totalCharacter +" "+"total");
 }

 private void representationString(String represent){
   System.out.println(represent);
 }

 private int getFunctionalCommandValue(String command,Wc file){
   switch(command){
        case "-l" :
         return file.lineCount();
        case "-w" :
         return file.wordCount();
        case "-m" :
         return file.byteCount();
        case "-c" :
         return file.characterCount();
        default :
         return 0;
     }
 }

 public void representation(){
   if(this.hasCommand())
     this.withCommandRepresentation();
   else
     this.withoutCommandRepresentation();
 }
}

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
} 

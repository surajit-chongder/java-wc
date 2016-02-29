class Wc {
    private final String content;

    public Wc(String contentElement) {
        this.content = contentElement;
    }

    public int characterCount() {
        return this.content.length();
    }

    public int lineCount() {
        int noOfLine = this.content.split("\n").length;
        return (noOfLine > 1) ? noOfLine : 0;
    }

    public int wordCount() {
        return this.content.split(" ").length;
    }

    public int byteCount() {
        return this.content.getBytes().length;
    }
}

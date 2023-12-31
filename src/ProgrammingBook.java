public class ProgrammingBook extends Books {
    private String language;
    private String framework;

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    @Override
    public String toString() {
        return super.toString() + " ProgrammingBook{" +
                "language='" + language + '\'' +
                ", framework='" + framework + '\'' +
                '}';
    }
}

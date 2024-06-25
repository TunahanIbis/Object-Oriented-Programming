  // Part II
// Let's define a Book class and implement the methods on it.
public class BookPartII implements BookPartI {
  private String author;
  private String bookName;
  private int year;

  // We should write parameters inside of BookPartII constructor.
  public BookPartII(String author, String bookName, int year) {
      this.author = author;
      this.bookName = bookName;
      this.year = year;
  }

  // It is our methods.
  public String getauthor() {
      return author;
  }

  public String getbookName() {
      return bookName;
  }

  public int getyear() {
      return year;
  }

  // Let's test it.
  public static void main(String[] args) {
      BookPartI myBook = new BookPartII("Tezer Özlü", "Yaşamın Ucuna Yolculuk", 1984);
      System.out.println("Author: " + myBook.getauthor());
      System.out.println("Book Name: " + myBook.getbookName());
      System.out.println("Publishment Year: " + myBook.getyear());
  }
}
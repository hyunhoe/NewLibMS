/**
 * Book 책에 대한 클래스
 *
 * @author (2023320018_김현중)
 * @version (2026.11.16)
 */
public class Book implements Comparable<Book>
{
    private String title;
    private String author;
    private String bookID;
    private Loan loanData; // 클래스 다이어그램: Loan과 1:1 연관

    public Book(String title, String author, String bookID)
    {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
        this.loanData = null;
    }

    public void display()
    {
        System.out.println("책 제목: " + title);
        System.out.println("저자 : " + author);
        System.out.println("책 ID: " + bookID);
    }

    public boolean check()
    {
        boolean resultBook = (loanData == null);
        return resultBook;
    }

    public void setLoan(Loan loan)
    {
        this.loanData = loan;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getBookID()
    {
        return bookID;
    }

    @Override
    public int compareTo(Book other)
    {
        return this.bookID.compareTo(other.bookID);
    }
}
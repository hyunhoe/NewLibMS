
/**
 * Book 책에 대한 클래스
 *
 * @author (2023320018_김현중)
 * @version (2026.11.03)
 */
public class Book
{
    private String title;
    private String author;
    private String bookID;
    private boolean available;

    /**
     * Book - 클래스의 객체 생성자
     *
     * @param  title 제목
     * @param  author 저자
     * @param  bookID 책 등록번호
     * @return    x 와 y의 합
     */
    public Book(String title, String author, String bookID)
    {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
        available = true;
    }

    /**
     * display - 책 정보를 화면에 출력하는 메소드
     *
     */
    public void display()
    {
        System.out.println("책 제목: " + title);
        System.out.println("저자 : " + author);
        System.out.println("책 ID: " + bookID);
    }

    /**
     * check - 책의 대출 가능 여부를 확인하는 메소드
     *
     * @return 대출 가능하면 true, 대출 중이면 false
     * 
     */
    public Boolean check()
    {
        return available;
    }

    /**
     * borrow - 책을 대출하는 메소드
     *
     */
    public void borrow()
    {
        if(available){
            available = false;
            System.out.println("대출 완료");
        }
        else{
            System.out.println("이미 대출 중인 책입니다.");
        }
    }

    /**
     * getTitle - 책 제목을 반환하는 메소드
     *
     *@return 책 제목
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * getAuthor - 저자를 반환하는 메소드
     *
     * @return 저자
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * getBookID - 책 등록번호를 반환하는 메소드
     *
     * @return 책 등록번호
     */
    public String getBookID()
    {
        return bookID;
    }

}
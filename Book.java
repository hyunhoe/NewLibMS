
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
     * check - 책 정보가 null인지 확인하는 메소드
     *
     * @return 책 정보가 모두 null이 아니며 true,
     *         하나라도 null이면 false
     */
    public Boolean check()
    {
        if(title != null && author != null && bookID != null){
            return true;
        }
        return false;
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
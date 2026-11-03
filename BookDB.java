import java.util.*;
/**
 * BookDB 책 정보를 저장하고 검색 하는 클래스
 *
 * @author (2023320018_김현중)
 * @version (2026.11.03)
 */
public class BookDB
{
    private ArrayList<Book> bookDB;

    /**
     * BookDB - 클래스 객체 생성자
     *
     */
    public BookDB()
    {
        bookDB = new ArrayList<Book>();
    }

    /**
     * search - 책 등록번호로 책을 검색하는 메소드
     *
     * @param bookID 책 등록번호
     * @return    검색하면 책, 없으면 null
     */
    public Book search(String bookID)
    {
        for(Book book : bookDB){
            if(book.getBookID().equals(bookID)){
                return book;
            }
        }
        return null;
    }

    /**
     * searchSameBook - 제목,저자,등록번호로 책을 검색하는 메소드
     *
     * @param  title 책 제목
     * @param  author 저자
     * @param  bookIK 책 등록번호
     * @return  검색한 책, 없으면 null
     */
    public Book searchSameBook(String title, String author, String bookID)
    {
        for(Book book : bookDB){
            if(book.getTitle().equals(title) &&
               book.getAuthor().equals(author) &&
               book.getBookID().equals(bookID)){
                   return book;
               }
        }
        return null;
    }

    /**
     * save - 책을 목록에 저장하는 메소드
     *
     * @param  book 저장할 책
     */
    public void save(Book book)
    {
        bookDB.add(book);
    }
}
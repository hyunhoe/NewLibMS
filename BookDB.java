import java.util.*;

/**
 * BookDB 책 정보를 저장하고 검색 하는 클래스
 *
 * @author (2023320018_김현중)
 * @version (2026.11.23)
 */
public class BookDB
{
    private TreeSet<Book> bookDB; // 클래스 다이어그램: TreeSet으로 구현

    public BookDB()
    {
        bookDB = new TreeSet<Book>((b1, b2) -> b1.bookID.compareTo(b2.bookID));
    }

    /**
     * search - 책 등록번호로 책을 검색하는 메소드
     *
     * @param bookID 책 등록번호
     * @return 검색하면 책, 없으면 null
     */
    public Book search(String bookID)
    {
        for(Book book : bookDB){
            if(book.bookID.equals(bookID)){
                return book;
            }
        }
        return null;
    }

    /**
     * save - 신규 책을 목록에 저장하는 메소드
     *
     * @param book 저장할 책 객체
     */
    public void save(Book book)
    {
        bookDB.add(book);
    }
}
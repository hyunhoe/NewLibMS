import java.util.*;

/**
 * BookDB 책 정보를 저장하고 검색 하는 클래스
 *
 * @author (2023320018_김현중)
 * @version (2026.11.16)
 */
public class BookDB
{
    private TreeSet<Book> bookDB; // 클래스 다이어그램: TreeSet으로 구현

    public BookDB()
    {
        bookDB = new TreeSet<Book>();
    }

    public Book search(String bookID)
    {
        for(Book book : bookDB){
            if(book.getBookID().equals(bookID)){
                return book;
            }
        }
        return null;
    }

    public void save(Book book)
    {
        bookDB.add(book);
    }
}
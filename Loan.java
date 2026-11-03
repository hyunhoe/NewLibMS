import java.time.*;

/**
 * Loan 대출에 대한 클래스
 *
 * @author (작성자 이름)
 * @version (2026.11.03)
 */
public class Loan
{
    private LocalDate loanDate;
    private LocalDate dueDate;
    private User borrower;
    private Book borrowedBook;

    /**
     * Loan 클래스의 객체 생성자
     * @param  user 이용자
     * @param  book 책
     */
    public Loan(User user, Book book)
    {
        this.loanDate = LocalDate.now();
        this.dueDate = loanDate.plusDays(14);
        this.borrower = user;
        this.borrowedBook = book;
    }

    /**
     * 대출 정보를 화면에 출력하는 메소드
     * 
     */
    public void display()
    {
        borrower.display();
        borrowedBook.display();
        System.out.println("대출일시: " + loanDate);
        System.out.println("반납기한: " + dueDate);
    }
}
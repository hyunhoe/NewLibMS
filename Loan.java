import java.time.*;

/**
 * Loan 도서 대출 정보를 관리하는 클래스
 *
 * @author (2023320035 윤효준)
 * @version (2026.11.23)
 */
public class Loan
{
    LocalDate loanDate;   // 대출일시
    LocalDate dueDate;    // 반납기한 (대출일로부터 14일 뒤)
    User borrower;        // 대출자
    Book borrowedBook;    // 대출도서
     
    /**
     * Loan 클래스의 객체 생성자
     * 
     * @param user 대출하는 이용자(User) 객체
     * @param book 대출되는 도서(Book) 객체
     */
    public Loan(User user, Book book)
    {
        this.loanDate = LocalDate.now();            // 현재 시스템 날짜를 대출일로 설정
        this.dueDate = loanDate.plusDays(14);       // 대출일로부터 14일 후를 반납기한으로 설정
        this.borrower = user;                       // 대출자 연결
        this.borrowedBook = book;                   // 대출도서 연결
        
        // 양방향 연관관계 연결 (user의 loanData ArrayList에 현재 대출 추가)
        user.loanData.add(this);
        book.loanData = this;
    }

    /**
     * display - 대출 정보를 화면에 출력하는 메소드
     */
    public void display()
    {
        borrower.display();
        borrowedBook.display();
        System.out.println("대출일시: " + loanDate);
        System.out.println("반납기한: " + dueDate);
    }
}
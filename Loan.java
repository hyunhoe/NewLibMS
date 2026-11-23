import java.time.*;

/**
 * Loan 도서 대출 정보를 관리하는 클래스
 *
 * @author (2023320035 윤효준)
 * @version (2026.11.16)
 */
public class Loan
{
    private LocalDate loanDate;   // 대출일시 (책을 빌린 날짜)
    private LocalDate dueDate;    // 반납기한 (대출일로부터 14일 뒤)
    private User borrower;        // 대출자 (책을 빌린 User 객체)
    private Book borrowedBook;    // 대출도서 (대출된 Book 객체)

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
        this.borrower = user;                       // 매개변수로 받은 이용자(user)를 대출자로 연결
        this.borrowedBook = book;                   // 매개변수로 받은 도서(book)를 대출도서로 연결
        
        user.addLoan(this);                         // 이용자의 대출 목록(loanData)에 현재 대출(this) 추가
        book.setLoan(this);                         // 도서의 대출 정보(loanData)에 현재 대출(this) 설정
    }

    /**
     * getBorrower - 대출자(User) 객체를 반환하는 메소드
     *
     * @return 책을 빌린 이용자(User) 객체
     */
    public User getBorrower()
    {
        return borrower; // 저장된 대출자(borrower) 반환
    }

    /**
     * display - 대출자 정보, 도서 정보, 대출일시, 반납기한을 화면에 출력하는 메소드
     */
    public void display()
    {
        borrower.display();                         // 대출자(User)의 학번과 이름 출력
        borrowedBook.display();                     // 대출도서(Book)의 제목, 저자, 책 ID 출력
        System.out.println("대출일시: " + loanDate); // 대출 날짜 출력
        System.out.println("반납기한: " + dueDate);  // 반납 예정일 출력
    }
}
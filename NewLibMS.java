import java.util.*;

/**
 * NewLibMS 도서관 관리 시스템의 메인 제어 클래스
 *
 * @author (2023320026_손상우)
 * @version (2026.11.16)
 */
public class NewLibMS {
    private String name;
    private UserDB userDB;
    private BookDB bookDB;
    private LoanDB loanDB;

    public NewLibMS() {
        this.name = "NewLibMS System";
        this.userDB = new UserDB();
        this.bookDB = new BookDB();
        this.loanDB = new LoanDB();
    }

    /**
     * 도서 대출 기능 (시퀀스 다이어그램 기준)
     */
    public void borrowBook(String stID, String bookID) {
        // 1. 책 및 이용자 검색
        Book book = bookDB.search(bookID);
        User user = userDB.search(stID);

        // 2. 1차 alt: null 체크 및 정보 출력
        if (user == null) {
            System.out.println("이용자를 찾을 수 없음!");
            return;
        } else if (book == null) {
            System.out.println("책을 찾을 수 없음!");
            return;
        } else {
            book.display();
            user.display();
        }

        // 3. 대출 가능 여부 체크
        boolean resultBook = book.check();
        boolean resultUser = user.check();

        // 4. 2차 alt: 조건별 메시지 출력 및 분기
        if ((resultBook == false) && (resultUser == false)) {
            System.out.println("해당 책은 대출중! & 이용자는 3권까지만 대출 가능!");
            return;
        } else if ((resultBook == true) && (resultUser == false)) {
            System.out.println("책 대출가능! & 이용자는 3권까지만 대출 가능!");
            return;
        } else if ((resultBook == false) && (resultUser == true)) {
            System.out.println("해당 책은 대출중! & 이용자 대출 가능!");
            return;
        } else {
            System.out.println("책 대출가능! & 이용자 대출 가능!");
        }

        // 5. 대출 객체 생성 및 연관관계 설정
        Loan loan = new Loan(user, book);
        user.addLoan(loan);
        book.setLoan(loan);

        // 6. 시퀀스 다이어그램 호출
        User borrower = loan.getBorrower();
        loan.display();
        loanDB.save(loan);

        // 7. 확인증 화면에 표시 (대출 정보와 대출 권수 화면에 표시)
        System.out.println("현재 총 대출 권수: " + borrower.getLoanCount() + "권");
    }
}
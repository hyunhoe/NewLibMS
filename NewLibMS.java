import java.util.*;

/**
 * NewLibMS 도서관 관리 시스템의 메인 제어 클래스
 *
 * @author (2023320026_손상우)
 * @version (2026.11.23)
 */
public class NewLibMS {
    private String name;
    private UserDB userDB;
    private BookDB bookDB;
    private LoanDB loanDB;

    /**
     * NewLibMS 객체 생성자
     * 시스템 시작 시 각 데이터베이스를 초기화합니다.
     */
    public NewLibMS() {
        this.name = "NewLibMS System";
        this.userDB = new UserDB();
        this.bookDB = new BookDB();
        this.loanDB = new LoanDB();
    }

    /**
     * 신규 회원 가입 기능
     * 
     * @param stID 학번
     * @param name 이름
     */
    public void registerUser(String stID, String name) {
        if (userDB.search(stID) != null) {
            System.out.println("이미 등록된 학번입니다.");
            return;
        }
        User newUser = new User(stID, name);
        userDB.save(newUser);
        System.out.println(name + " 이용자가 성공적으로 등록되었습니다.");
    }

    /**
     * 신규 책 등록 기능
     * 
     * @param title 책 제목
     * @param author 저자
     * @param bookID 책 등록번호
     */
    public void registerBook(String title, String author, String bookID) {
        if (bookDB.search(bookID) != null) {
            System.out.println("이미 등록된 도서 번호입니다.");
            return;
        }
        Book newBook = new Book(title, author, bookID);
        bookDB.save(newBook);
        System.out.println("도서 '" + title + "' 등록이 완료되었습니다.");
    }

    /**
     * 도서 대출 기능
     * 
     * @param stID 이용자 학번
     * @param bookID 대출할 도서 등록번호
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

        // 5. 대출 객체 생성 
        Loan loan = new Loan(user, book);

        // 6. 대출 정보 출력 및 DB 저장
        System.out.println("\n=== 대출 확인증 ===");
        loan.display();
        loanDB.save(loan);

        // 7.현재 대출 중인 권수 표시
        System.out.println("현재 총 대출 권수: " + user.loanData.size() + "권");
        System.out.println("===================");
    }
}
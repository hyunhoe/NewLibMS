import java.util.*;

/**
 * NewLibMS 도서관 관리 시스템의 메인 제어 클래스
 * 이용자, 도서, 대출 데이터베이스를 통합하여 도서관의 주요 기능(대출 등)을 수행합니다.
 * @author (2023320026_손상우)
 * @version (2026.11.04)
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
        this.name = "SM도서관"; 
        this.userDB = new UserDB();
        this.bookDB = new BookDB(); 
        this.loanDB = new LoanDB();
    }

    /**
     * 신규 이용자 등록 기능
     * 
     * @param stID 학번
     * @param name 이름
     */
    public void registerUser(String stID, String name) {
        
        if (userDB.searchSameUser(stID, name) != null) {
            System.out.println("이미 동일한 정보로 등록된 이용자입니다.");
            return;
        }
        
        User newUser = new User(stID, name);
        userDB.save(newUser);
        newUser.display();
        System.out.println(name + " 이용자가 성공적으로 등록되었습니다.");
    }
    
    /**
     * 도서 등록 기능
     * 
     * @param title 책 제목
     * @param author 저자
     * @param bookID 책 등록번호
     */
    public void registerBook(String title, String author, String bookID) {
        
        if (bookDB.searchSameBook(title, author, bookID) != null) {
            System.out.println("이미 동일한 정보로 등록된 책입니다.");
            return;
        }
        
        Book newBook = new Book(title, author, bookID);
        bookDB.save(newBook);
        newBook.display();
        System.out.println("'" + title + "' 등록이 완료되었습니다.");
    }

    /**
     * 도서 대출 기능
     * 
     * @param stID 이용자 학번
     * @param bookID 대출할 도서 번호
     */
    public void borrowBook(String stID, String bookID) {
        Book book = bookDB.search(bookID);
        User user = userDB.search(stID);
        
        if(user == null){
            System.out.println("이용자를 찾을 수 없음!");
            return;
        }
        else if(book == null){
            System.out.println("책을 찾을 수 없음");
            return;
        }
        else{
            user.display();
            book.display();
        }
        
        
        boolean resultBook = book.check();
        boolean resultUser = user.check(loanDB.getLoanCount(stID));
        
        if (resultBook == false && resultUser == false) {
            System.out.println("책 대출불가능! & 이용자 대출불가능!");
            return;
        } else if (resultBook == true && resultUser == false) {
            System.out.println("책 대출가능! & 이용자 대출불가능!");
            return;
        } else if (resultBook == false && resultUser == true) {
            System.out.println("책 대출불가능! & 이용자 대출가능!");
            return;
        } 
        else{
            Loan newLoan = new Loan(user, book);
            book.linkLoan(newLoan);
            
            
            System.out.println("\n[시스템 모니터 화면: 대출 정보 확인]");
            newLoan.display();
            
            
            loanDB.save(stID, newLoan);
            
            
            System.out.println("\n[실물 프린터: 대출 확인증 인쇄 중...]");
            printFile(newLoan, stID);
            
            
            int remainCount = 3 - loanDB.getLoanCount(stID);
            System.out.println(user.getName() + "님, 대출이 완료되었습니다.");
            System.out.println("현재 남은 대출 가능 권수는 " + remainCount + "권입니다.");
        }
    }

    /**
     * 대출 정보 파일 출력 기능
     * 
     * @param loan 대출 객체
     * @param stID 학번
     */
    public void printFile(Loan loan, String stID) {
        if (loan != null) {
            System.out.println("--- 대출 정보 파일 출력 (확인증) ---");
            loan.display();
            System.out.println("대출 건수: " + loanDB.getLoanCount(stID) + " / 3");
        } else {
            System.out.println("출력할 대출 정보가 없습니다.");
        }
    }
}
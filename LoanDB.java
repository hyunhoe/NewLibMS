import java.util.*;
/**
 * LoanDB 대출 객체를 저장하는 클래스
 *
 * @author (2024320014 박동해)
 * @version (2026. 11. 03)
 */
public class LoanDB {
    private ArrayList<Loan> loanDB;
    /**
     * LoanDB 클래스의 객체 생성자
     * 대출 정보들을 담는 ArrayList<Loan> 컬렉션을 초기화
     */
    public LoanDB() {
        this.loanDB = new ArrayList<Loan>();
    }

    /**
     * 대출 정보를 저장하는 메소드
     * @param loan - 새로 추가할 대출 객체(Loan)
     */
    public void save(Loan loan) {
        this.loanDB.add(loan);
    }
}
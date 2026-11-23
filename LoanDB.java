import java.util.*;

/**
 * LoanDB 대출 객체를 저장하는 클래스
 *
 * @author (2024320014 박동해)
 * @version (2026.11.16)
 */
public class LoanDB {
    private ArrayList<Loan> loanDB; // 클래스 다이어그램: ArrayList로 구현

    public LoanDB() {
        this.loanDB = new ArrayList<Loan>();
    }

    public void save(Loan loan) {
        this.loanDB.add(loan);
    }
}
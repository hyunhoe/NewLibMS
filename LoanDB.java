import java.util.*;

/**
 * LoanDB 대출 객체를 저장하는 클래스
 *
 * @author (2024320014 박동해)
 * @version (2026.11.23)
 */
public class LoanDB {
    private ArrayList<Loan> loanDB; // 클래스 다이어그램: ArrayList로 구현

    public LoanDB() {
        this.loanDB = new ArrayList<Loan>();
    }

    /**
     * save - 대출 정보를 저장하는 메소드
     * 
     * @param loan 새로 추가할 대출 객체(Loan)
     */
    public void save(Loan loan) {
        this.loanDB.add(loan);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void findLoan(Book book)
    {
        // 여기에 코드를 작성하세요
        return y;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void remove(Loan loan)
    {
        // 여기에 코드를 작성하세요
        return y;
    }

}
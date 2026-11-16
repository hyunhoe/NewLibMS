import java.util.*;
/**
 * LoanDB 대출 객체를 저장하는 클래스
 *
 * @author (2024320014 박동해)
 * @version (2026. 11. 03)
 */
public class LoanDB
{
    private HashMap<String, ArrayList<Loan>> loanDB;

    /**
     * LoanDB 클래스의 객체 생성자
     * 
     */
    public LoanDB() {
        this.loanDB = new HashMap<String, ArrayList<Loan>>();
    }

    /**
     * 대출 정보를 저장하는 메소드
     * @param stID 학번
     * @param loan 대출객체
     */
    public void save(String stID, Loan loan) {
        if(loanDB.containsKey(stID) == false){
            loanDB.put(stID, new ArrayList<Loan>());
        }

        loanDB.get(stID).add(loan);
    }
}
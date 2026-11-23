import java.util.*;

/**
 * User 도서관 이용자의 정보를 관리하는 클래스
 *
 * @author (2023320023 이현회)
 * @version (2026.11.16)
 */
public class User
{
    private String stID; // 이용자 학번 (Student ID)
    private String name; // 이용자 이름
    private ArrayList<Loan> loanData; // 클래스 다이어그램: 0..3 ArrayList로 구현

    /**
     * User 클래스의 객체 생성자
     * 
     * @param stID 이용자의 학번 (예: "2023320026")
     * @param name 이용자의 이름 (예: "손상우")
     */
    public User(String stID, String name)
    {
        this.stID = stID;
        this.name = name;
        this.loanData = new ArrayList<Loan>();
    }

    /**
     * display - 이용자 학번과 이름을 출력하는 메소드
     */
    public void display()
    {
        System.out.println("학번 : " + stID);
        System.out.println("이름 : " + name);
    }
    
    /**
     * check - 이용자의 대출 가능 여부를 확인하는 메소드
     *
     * @return 대출 권수가 3권 미만이면 true, 3권 이상이면 false
     */
    public boolean check()
    {
        boolean resultUser = loanData.size() < 3;
        return resultUser;
    }

    /**
     * addLoan - 이용자의 대출 목록에 대출 정보를 추가하는 메소드
     *
     * @param loan 추가할 대출(Loan) 객체
     */
    public void addLoan(Loan loan)
    {
        loanData.add(loan);
    }

    /**
     * getLoanCount - 이용자의 현재 대출 권수를 반환하는 메소드
     *
     * @return 현재 대출 권수
     */
    public int getLoanCount()
    {
        return loanData.size();
    }

    /**
     * getstID - 이용자의 학번을 반환하는 메소드
     *
     * @return 이용자의 학번 (stID)
     */
    public String getstID()
    {
        return stID;
    }

    /**
     * getname - 이용자의 이름을 반환하는 메소드
     *
     * @return 이용자의 이름 (name)
     */
    public String getname()
    {
        return name;
    }
}
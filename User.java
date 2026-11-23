import java.util.*;

/**
 * User 도서관 이용자의 정보를 관리하는 클래스
 *
 * @author (2023320023 이현회)
 * @version (2026.11.23)
 */
public class User
{
    String stID; // 이용자 학번 (Student ID)
    String name; // 이용자 이름
    ArrayList<Loan> loanData; // 클래스 다이어그램: 0..3 ArrayList로 구현

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
}
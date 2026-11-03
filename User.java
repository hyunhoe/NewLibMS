
/**
 * User 도서관 이용자의 정보를 관리하는 클래스
 *
 * @author (2023320023 이현회)
 * @version (2026.11.03)
 */
public class User
{
    private String stID;
    private String name;
    private int loanCount;

    /**
     * User 클래스의 객체 생성자
     * 
     * @param stID  이용자 학번
     * @param name  이용자 이름
     */
    public User(String stID, String name)
    {
        this.stID = stID;
        this.name = name;
        this.loanCount = 0;
    }

    /**
     * display - 이용자 학번과 이름 출력하는 메소드
     */
    public void display()
    {
        System.out.println("학번 : " + stID);
        System.out.println("이름 : " + name);
    }
    
    /**
     * check - 이용자의 대출 가능여부 확인하는 메소드
     *
     * @return    대출 권수가 3권 미만이면 true, 3권 이상이면 false
     */
    public boolean check()
    {
        boolean resultUser = loanCount < 3;
        return resultUser;
    }

    /**
     * getLoanCount - 이용자의 현재 대출 권수 반환하는 메소드
     *
     * @return    현재 대출 권수
     */
    public int getLoanCount()
    {
        return loanCount;
    }

    /**
     * increaseLoanCount - 대출 권수를 1 증가시키는 메소드
     */
    public void increaseLoanCount()
    {
        loanCount++;
    }

    /**
     * decreaseLoanCount - 대출 권수를 1 감소시키는 메소드
     */
    public void decreaseLoanCount()
    {
        loanCount--;
    }

    /**
     * getstID - 이용자의 학번을 반환하는 메소드
     *
     * @return    이용자의 학번
     */
    public String getstID()
    {
        return stID;
    }

    /**
     * getname - 이용자의 이름을 반환하는 메소드
     *
     * @return    이용자의 이름
     */
    public String getname()
    {
        return name;
    }

}

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
     * check - 이용자의 대출 가능여부 확인하는 메소드
     *
     * @return    대출 권수가 3권 미만이면 true, 3권 이상이면 false
     */
    public boolean check(int loanCount)
    {
        boolean resultUser = loanCount < 3;
        return resultUser;
    }

    /**
     * getstID - 이용자의 학번을 반환하는 메소드
     *
     * @return    이용자의 학번
     */
    public String getStID()
    {
        return stID;
    }

    /**
     * getname - 이용자의 이름을 반환하는 메소드
     *
     * @return    이용자의 이름
     */
    public String getName()
    {
        return name;
    }
}
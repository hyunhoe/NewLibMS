
/**
 * User 클래스의 설명을 작성하세요.
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
     */
    public User(String stID, String name)
    {
        this.stID = stID;
        this.name = name;
        this.loanCount = 0;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public void display()
    {
        System.out.println("[" + stID + "]" + name);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public boolean check()
    {
        boolean resultUser = loanCount < 3;
        return resultUser;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public int getLoanCount()
    {
        return loanCount;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void increaseLoanCount()
    {
        loanCount++;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void decreaseLoanCount()
    {
        loanCount--;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String getstID()
    {
        return stID;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public String getname()
    {
        return name;
    }

}
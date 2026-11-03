import java.util.*;

/**
 * UserDB 클래스의 설명을 작성하세요.
 *
 * @author (2023320023 이현회)
 * @version (2026.11.03)
 */
public class UserDB
{
    private ArrayList<User> userDB;

    /**
     * UserDB 클래스의 객체 생성자
     */
    public UserDB()
    {
        userDB = new ArrayList<User>();
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public User search(String stID)
    {
        for(User user : userDB){
            if(stID.equals(user.getstID())){
                return user;
            }
        }
        return null;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public User searchSameUser(String stID, String name)
    {
        for (User user : userDB){
            if(stID.equals(user.getstID()) && name.equals(user.getname())){
                return user;
            }
        }
        return null;
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void save(User user)
    {
        userDB.add(user);
    }

}
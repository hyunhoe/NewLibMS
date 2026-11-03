import java.util.*;

/**
 * UserDB 도서관 이용자 데이터베이스 관리하는 클래스
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
     * search - 학번으로 등록된 이용자를 검색하는 메소드
     *
     * @param  stID  이용자의 학번
     * @return    동일한 학번 존재 시 user 반환, 없을 시 null 반환
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
     * searchSameUser - 학번과 이름이 동일한 이용자가 있는지 검색하는 메소드
     *
     * @param  stID  이용자의 학번
     * @param  name  이용자의 이름
     * @return    동일한 학번과 이름이 존재하면 user 반환, 없을 시 null 반환
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
     * save - 이용자 객체를 이용자DB에 저장하는 메소드
     *
     * @param  user  이용자 객체
     */
    public void save(User user)
    {
        userDB.add(user);
    }

}
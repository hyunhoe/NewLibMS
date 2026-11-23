import java.util.*;

/**
 * UserDB 도서관 이용자 데이터베이스 관리하는 클래스
 *
 * @author (2023320023 이현회)
 * @version (2026.11.16)
 */
public class UserDB
{
    private ArrayList<User> userDB; // 클래스 다이어그램: ArrayList로 구현

    public UserDB()
    {
        userDB = new ArrayList<User>();
    }

    public User search(String stID)
    {
        for(User user : userDB){
            if(stID.equals(user.getstID())){
                return user;
            }
        }
        return null;
    }

    public void save(User user)
    {
        userDB.add(user);
    }
}
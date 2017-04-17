package By.career.Service;

import By.career.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Evgenia on 16.04.2017.
 */

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean checkLogin(String login, String password) {

        return userDao.checkLogin(login, password);
    }
}

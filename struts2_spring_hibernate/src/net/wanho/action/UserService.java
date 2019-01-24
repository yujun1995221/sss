package net.wanho.action;

import java.util.List;

public class UserService {


    UserDao userDao;


    public List<User> selectUsers() {
        return userDao.select();
    }



    public User getUserById(int id)
    {
        return userDao.get(id);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

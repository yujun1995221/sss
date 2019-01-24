package net.wanho.action;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.List;

public class UserDao extends HibernateDaoSupport {
    public List<User> select() {
        List<User> ret = new ArrayList<>();
        try {
            ret =  this.getHibernateTemplate().loadAll(User.class);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return ret;
    }

    public User get(int id) {
        return this.getHibernateTemplate().get(User.class,id);
    }
}

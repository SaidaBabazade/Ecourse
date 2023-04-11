package az.orient.ecourse.dao;

import az.orient.ecourse.model.LoginUser;

public interface LoginUserDao {

    LoginUser login(String username,String password) throws Exception;
}

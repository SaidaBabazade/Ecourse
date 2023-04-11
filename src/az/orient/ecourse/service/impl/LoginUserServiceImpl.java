package az.orient.ecourse.service.impl;

import az.orient.ecourse.dao.LoginUserDao;
import az.orient.ecourse.model.LoginUser;
import az.orient.ecourse.service.LoginUserService;

public class LoginUserServiceImpl implements LoginUserService {

    private LoginUserDao loginUserDao;

    public LoginUserServiceImpl(LoginUserDao loginUserDao) {
        this.loginUserDao = loginUserDao;
    }

    @Override
    public LoginUser login(String username, String password) throws Exception {
        return loginUserDao.login(username,password);
    }
}

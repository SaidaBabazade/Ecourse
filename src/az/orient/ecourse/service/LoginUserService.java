package az.orient.ecourse.service;

import az.orient.ecourse.model.LoginUser;

public interface LoginUserService {

    LoginUser login(String username, String password) throws Exception;

}

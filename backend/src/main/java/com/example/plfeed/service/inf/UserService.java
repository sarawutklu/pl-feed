package com.example.plfeed.service.inf;

import java.util.List;
import com.example.plfeed.vm.SaveUserVM;
import com.example.plfeed.vm.UserVm;

public interface UserService {
    
    List<UserVm> getUserAll();

    UserVm getUser(String id);

    boolean createUser(SaveUserVM user);

    boolean updateUser(UserVm user);

    boolean deleteUser(String id);

}

package krd.snapfood.user;

import org.apache.catalina.User;

public interface UserAppService {

     UserApp save(UserApp user);
     UserApp update(UserApp user);
     UserApp getById(Long userId);
     void deleteById(Long id);
}

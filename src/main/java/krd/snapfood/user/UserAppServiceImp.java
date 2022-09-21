package krd.snapfood.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserAppServiceImp implements UserAppService {

    private final UserAppRepository repository;


    @Override
    public UserApp save(UserApp user) {
        return repository.save(user);
    }

    @Override
    public UserApp update(UserApp user) {
        UserApp updateUser=getById(user.getId());

        updateUser.setUserName(updateUser.getUserName());
        updateUser.setPassword(user.getPassword());
        updateUser.setPhone(user.getPhone());

        return repository.save(updateUser);
    }

    @Override
    public void deleteById(Long id) {
        getById(id);
        repository.deleteById(id);
    }

    @Override
    public UserApp getById(Long userId) {
        Optional<UserApp> optionalUserApp=repository.findById(userId);
        if(!optionalUserApp.isPresent()){
            throw  new RuntimeException("User Not Found ");
        }
        return optionalUserApp.get();
    }

}
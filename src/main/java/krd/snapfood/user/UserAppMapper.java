package krd.snapfood.user;

import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserAppMapper {

    UserApp toUserApp(UserAppDTO userAppDTO);
    UserAppDTO toUserAppDTO(UserApp userApp);

    List<UserApp> toUserApp(List<UserAppDTO> userAppDTOS);
    List<UserAppDTO> toUserAppDTO(List<UserApp> userApps);

}
package mr.airbnbclone.user.mapper;

import mr.airbnbclone.user.application.dto.ReadUserDTO;
import mr.airbnbclone.user.domain.Authority;
import mr.airbnbclone.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}

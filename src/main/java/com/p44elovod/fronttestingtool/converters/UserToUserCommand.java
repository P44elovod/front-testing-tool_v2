package com.p44elovod.fronttestingtool.converters;

import com.p44elovod.fronttestingtool.commands.UserCommand;
import com.p44elovod.fronttestingtool.models.User;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class UserToUserCommand implements Converter<UserCommand, User> {


    @Synchronized
    @Nullable
    @Override
    public User convert(UserCommand source) {

        if (source == null) {
            return null;
        }


        final User user = new User();

        user.setId(source.getId());
        user.setUserName(source.getUserName());
        user.setCellPhone(source.getCellPhone());
        user.setWorkEmail(source.getWorkEmail());
        user.setPersEmail(source.getPersEmail());
        user.setBirthDate(source.getBirthDate());


        return user;
    }
}

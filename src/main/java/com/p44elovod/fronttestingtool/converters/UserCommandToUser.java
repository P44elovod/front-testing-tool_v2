package com.p44elovod.fronttestingtool.converters;

import com.p44elovod.fronttestingtool.commands.UserCommand;
import com.p44elovod.fronttestingtool.models.User;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class UserCommandToUser implements Converter<User, UserCommand> {

    @Synchronized
    @Nullable
    @Override
    public UserCommand convert(User source) {


        if (source == null) {
            return null;
        }
        final UserCommand userCommand = new UserCommand();

        userCommand.setId(source.getId());
        userCommand.setBirthDate(source.getBirthDate());
        userCommand.setCellPhone(source.getCellPhone());
        userCommand.setPersEmail(source.getPersEmail());
        userCommand.setWorkEmail(source.getWorkEmail());
        userCommand.setUserName(source.getUserName());
        return userCommand;
    }
}

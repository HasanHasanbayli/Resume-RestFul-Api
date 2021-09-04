package com.example.ResumeRestApi.mapper;

import com.example.ResumeRestApi.dto.UserDTO;
import com.example.ResumeRestApi.model.User;
import org.apache.catalina.mapper.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.Mapping;

@Configuration
public class ApiMapperBeanConfig {

//    @Bean
//    public Mapper<UserDTO, User> userDTOUserMapper(){
//        return Mapping.from(UserDTO.class)
//                .to(User.class)
//                .mapper();
//    }
}

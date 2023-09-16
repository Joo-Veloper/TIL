package me.seungjoo.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.seungjoo.springbootdeveloper.domain.User;
import me.seungjoo.springbootdeveloper.dto.AddUserRequest;
import me.seungjoo.springbootdeveloper.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
package com.mycondo.app.service;

import com.mycondo.app.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(Long id, UserDTO userDTO);
    UserDTO getUserById(Long id);
    UserDTO getUserByEmail(String email);
    List<UserDTO> getAllUsers();
    void deleteUser(Long id);
    void deactivateUser(Long id);
    void activateUser(Long id);
} 
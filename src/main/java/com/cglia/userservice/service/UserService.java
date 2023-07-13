package com.cglia.userservice.service;

import com.cglia.userservice.dto.DepartmentDto;
import com.cglia.userservice.dto.ResponseDto;
import com.cglia.userservice.model.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(int userId);
    
    public DepartmentDto create(DepartmentDto department);

	void deleteDepartment(int id);
}

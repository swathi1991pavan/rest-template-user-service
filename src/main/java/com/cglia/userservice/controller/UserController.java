package com.cglia.userservice.controller;

import lombok.AllArgsConstructor;

import com.cglia.userservice.dto.DepartmentDto;
import com.cglia.userservice.dto.ResponseDto;
import com.cglia.userservice.model.User;
import com.cglia.userservice.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@AllArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") int userId){
        ResponseDto responseDto = userService.getUser(userId);
        return ResponseEntity.ok(responseDto);
    }
    
    @PostMapping("/create")
    public DepartmentDto create(@RequestBody DepartmentDto department) {
    	DepartmentDto savedDepartmentDto = new DepartmentDto();
    	savedDepartmentDto = userService.create(department);
    	return savedDepartmentDto;
    }
    
    @DeleteMapping("{id}")
    public void  deleteDepartment(@PathVariable int id) {
    	userService.deleteDepartment(id);
    	
    }
}

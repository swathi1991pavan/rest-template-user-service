package com.cglia.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
	
	private DepartmentDto department;
    private UserDto user;
    
    public ResponseDto() {}
    public ResponseDto(DepartmentDto department, UserDto user) {
		super();
		this.department = department;
		this.user = user;
	}
    
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	
}
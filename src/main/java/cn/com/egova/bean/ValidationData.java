package cn.com.egova.bean;


import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;


public class ValidationData {

	@Range(min = 6,max = 16,message = "只能填报年龄在16-60岁之间")
	private int age;

	@NotBlank(message = "姓名不能为空")
	private String name;


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

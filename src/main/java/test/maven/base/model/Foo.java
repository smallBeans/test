package test.maven.base.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Foo implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3539414983212498131L;

	private String name;
	
	private Integer age;
	
	private Integer sex;


	/**
	 * default Constructor
	 */
	public Foo() {
	}

	public Foo(String name, Integer age, Integer sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}

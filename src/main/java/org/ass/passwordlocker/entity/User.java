package org.ass.passwordlocker.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.annotation.WebServlet;

import lombok.Data;
@Data
@Entity
@Table(name="user_details")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String name;
	
	private String gender;
	@Column(nullable=false)
	private Date dob;
	@Column(name="phone_num",nullable=false)
	private String phnNum;
	@Column(nullable=false,unique = true)
	private String email;
	@Column(nullable=false)
	private String password;
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", phnNum=" + phnNum
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}

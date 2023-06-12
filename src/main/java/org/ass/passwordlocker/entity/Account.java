package org.ass.passwordlocker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="account_details")
public class Account {
	@Id
	@Column(name="a_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="account_name",nullable=false)
	private String accountName;
	@Column(name="user_name",nullable=false)
	private String username;
	@Column(nullable=false,unique=true)
	private String password;
	private String review;
	
	@Column(name="user_id",nullable=false)
	
	private Integer  userId;
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountName=" + accountName + ", username=" + username + ", password="
				+ password + ", review=" + review + "]";
	}
	
	
}

package com.jdc.mkt.inheritance;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
//@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("1")
@DiscriminatorColumn(name = "Child",discriminatorType = DiscriminatorType.INTEGER)
public abstract class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,length = 45)
	private String name;
	
	@Column(
	columnDefinition = "varchar(15) not null unique check(char_length(loginId) >= 6)")
	private String loginId;
	
	@Column(
	columnDefinition = "varchar(15) not null check(char_length(password) >= 6)")
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Member member;
	
	
	public Account(Member member) {
		this.member = member;
	}
	
	public enum Member{
		Student,Teacher,Officer
	}
}

package com.jdc.mkt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 45)
	private String name;

	@Column(name = "member_card")
	@Enumerated(EnumType.STRING)
	private MemberCard card;
	
	@Column(columnDefinition = "tinyint(1) default 0")
	private boolean isDelete;
	
	public enum MemberCard{
		Default,Silver,Gold,Diamond
	}
	
	
	
	
}

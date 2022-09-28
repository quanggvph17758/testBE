package com.test.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String fullname;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date birthday;
	
	@Column
	private String gender;
	
	@Column
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	Role role_id;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user_id")
	List<Order> order;

}

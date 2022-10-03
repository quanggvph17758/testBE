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
@Table(name = "categories")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;

	@Temporal(TemporalType.DATE)
	@Column
	private Date create_Date;

	@Temporal(TemporalType.DATE)
	@Column
	private Date update_Date;

	@Column
	private String update_user;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category_id")
	List<Product> product;
}

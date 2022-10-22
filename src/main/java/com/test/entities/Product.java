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
@Table(name = "products")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String images;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date create_Date;

	@Temporal(TemporalType.DATE)
	@Column
	private Date update_Date;
	
	@Column
	private int price;

	@Column
	private String update_user;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category_id;

	@JsonIgnore
	@OneToMany(mappedBy = "product_id")
	List<OrderDetail> orderDetail;
}

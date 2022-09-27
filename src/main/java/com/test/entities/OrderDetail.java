package com.test.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderdetails")
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private int price;
	
	@Column
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	Product product_id;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	Order order_id;
}

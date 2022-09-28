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
@Table(name = "orders")
public class Order implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Date create_date;
	
	@Column
	private String phone;
	
	@Column
	private String address;
	
	@Column
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user_id;
	
//	@Column
//	private String user_id;
	
	@JsonIgnore
	@OneToMany(mappedBy = "order_id")
	List<OrderDetail> orderDetail;

}

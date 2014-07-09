package com.epam.training.jp.jpa.excercises.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String customer;
	@OneToOne(cascade=CascadeType.PERSIST)
	private Address deliveryAddress;
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<OrderItem> orderItems;
	@Enumerated(value=EnumType.STRING)
	private OrderState state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public FoodOrder(List<OrderItem> createOrderItems, Address address, String customer, OrderState pending) {
		orderItems = createOrderItems;
		deliveryAddress = address;
		this.customer = customer;
		state = pending;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	

}

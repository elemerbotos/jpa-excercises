package com.epam.training.jp.jpa.excercises.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue
	private int id;

	@OneToMany
	private List<OrderItem> orderItems;
	
	@ManyToOne
	private Address deliveryAddress;
	private String customer;
	private OrderState state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

	public FoodOrder() {
	}

	public FoodOrder(List<OrderItem> orderItems, Address deliveryAddress, String customer,
			OrderState state) {
		super();
		this.orderItems = orderItems;
		this.customer = customer;
		this.state = state;
		this.deliveryAddress = deliveryAddress;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

}

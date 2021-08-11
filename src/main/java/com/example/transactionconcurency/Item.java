package com.example.transactionconcurency;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity @Getter
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	private Integer quantity;
//
//	public void decreaseQuantity(Integer qty){
//		this.quantity -= qty;
//	}
}

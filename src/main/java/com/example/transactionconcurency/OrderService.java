package com.example.transactionconcurency;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final ItemRepository itemRepository;

	public void order(Long itemId){
		Item orderItem = itemRepository.findById(itemId).orElseThrow(RuntimeException::new);
//		orderItem.decreaseQuantity(1);
	}

}

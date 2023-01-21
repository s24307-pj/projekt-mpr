package com.example.s24307Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S24307BankApplication {
	private final TransferService transferService;

	public S24307BankApplication(TransferService transferService) {
		this.transferService = transferService;

		transferService.makeTransfer(new Client(2000,1), new Transfer(500, Status.ACCEPTED));
		transferService.getUserData(1);
	}

	public static void main(String[] args) {
		SpringApplication.run(S24307BankApplication.class, args);
	}
}

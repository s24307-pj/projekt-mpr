package com.example.s24307Bank;

public class Client {
    private double balance;
    private int client_id;

    public Client(double balance, int client_id) {
        this.balance = balance;
        this.client_id = client_id;
    }

    public double getBalance() {
        return balance;
    }

    public int getClient_id() {
        return client_id;
    }
}

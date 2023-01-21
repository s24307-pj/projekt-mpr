package com.example.s24307Bank;

public class Transfer {

    private double transfer_value;

    private Status status;

    private Client client;

    public Transfer(double transfer_value, Status status) {
        this.transfer_value = transfer_value;
        this.status = status;
    }

    public double getTransfer_value() {
        return transfer_value;
    }

    public int getClientId() {
        return client.getClient_id();
    }
}

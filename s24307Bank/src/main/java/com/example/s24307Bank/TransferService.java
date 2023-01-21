package com.example.s24307Bank;

import org.springframework.stereotype.Component;

@Component
public class TransferService {
    private Client client_id;
    private double transfer_value;
    private final TransferStorage transferStorage;

    public TransferService(TransferStorage transferStorage) {
        this.transferStorage = transferStorage;
    }

    public Transfer makeTransfer(Client client_id, Transfer transfer) {
        if (client_id.getClient_id() == (transfer.getClientId())  && transfer.getTransfer_value() > transfer_value) {
            return new Transfer((client_id.getBalance() - transfer.getTransfer_value()), Status.ACCEPTED);
        }
        else {
            return new Transfer(transfer.getTransfer_value(), Status.DECLINED);
        }
    }

    public Transfer depositMoney(Client client_id, Transfer transfer) {
        if (client_id.getClient_id() == (transfer.getClientId())) {
            return new Transfer((client_id.getBalance() + transfer.getTransfer_value()), Status.ACCEPTED);
        }
        else {
            return new Transfer(client_id.getBalance(), Status.DECLINED);
        }
    }

    public void getUserData(int id) {
        if (client_id.getClient_id() == id) {
            System.out.println("Masz na koncie" + client_id.getBalance());
        }
    }


}

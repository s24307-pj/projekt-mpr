package com.example.s24307Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class TransferStorage {

    private Register firstRegistration = new Register(new Client(10000,1));

    private Register secondRegistration = new Register(new Client(2000,2));

    private Register thirdRegistration = new Register(new Client(3000,3));

    private Register fourthRegistration = new Register(new Client(4000,4));

    private List<Register> registerList = new ArrayList<>();

    public List<Register> getRegisterList() {
        return registerList;
    }

    public TransferStorage() {
        registerList.add(firstRegistration);
        registerList.add(secondRegistration);
        registerList.add(thirdRegistration);
        registerList.add(fourthRegistration);
    }


}

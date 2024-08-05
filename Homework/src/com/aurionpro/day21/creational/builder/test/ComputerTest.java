package com.aurionpro.day21.creational.builder.test;

import com.aurionpro.day21.creational.builder.model.Computer;

public class ComputerTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                                .setCPU("Intel i9")
                                .setGPU("NVIDIA RTX 3080")
                                .setRAM(32)
                                .setStorage(1024)
                                .build();

        Computer officePC = new Computer.Builder()
                                .setCPU("Intel i5")
                                .setRAM(16)
                                .setStorage(512)
                                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }


}

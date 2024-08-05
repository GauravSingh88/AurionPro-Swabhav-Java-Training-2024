package com.aurionpro.day21.creational.builder.model;

public class Computer {
	private String CPU;
    private String GPU;
    private int RAM;
    private int storage;

    // Private constructor to force the use of the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", GPU=" + GPU + ", RAM=" + RAM + "GB, storage=" + storage + "GB]";
    }

    // Static inner Builder class
    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}


package com.aurionpro.day22.proxy.model;

public class RealStructuralDesign implements StructuralDesigns {

    @Override
    public void performAnalysis() {
        System.out.println("Performing complex structural analysis...");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Structural analysis complete.");
    }
}


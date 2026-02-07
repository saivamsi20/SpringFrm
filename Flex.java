package org.example;

import java.beans.ConstructorProperties;

public class Flex {

    private String modelName;
    private int modelYear;
    private Push psh;

    // No-arg constructor (user-defined)
//    public Flex() {
//        System.out.println("carrrr");
//    }


    public Flex(String modelName, int modelYear) {
        this.modelName = modelName;
        this.modelYear = modelYear;
    }

    public Push getPsh() {
        return psh;
    }

    public void setPsh(Push psh) {
        this.psh = psh;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void  flex(){
        System.out.println("Flex");
        psh.flex();
    }
}

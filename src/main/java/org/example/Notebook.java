package org.example;

public class Notebook {
    String name;

    String ram;
    String hdd;
    String os;
    String colour;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Notebook(String name  , String ram, String hdd, String os, String colour) {
        this.name = name;

        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                "}\n";

    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return colour;
    }
}

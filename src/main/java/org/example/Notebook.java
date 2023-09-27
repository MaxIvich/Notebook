package org.example;

public class Notebook {

    String ram;
    String hdd;
    String os;
    String colour;



    public Notebook(String ram, String hdd, String os, String colour) {

        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                '}';
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

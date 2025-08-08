package com.healthcare.module;

public class Patient_Reg {
	private int id;
    private String name;
    private int age;
    private String illness;
    
    public Patient_Reg(int id, String name, int age, String illness) {
    	this.id=id;
    	this.name=name;
    	this.age=age;
    	this.illness=illness;
    }
    public int get_Id() {
        return id;
    }
    public String get_Name() {
        return name;
    }

    public int get_Age() {
        return age;
    }

    public String get_Illness() {
        return illness;
    }

}

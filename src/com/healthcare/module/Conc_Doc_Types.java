package com.healthcare.module;

class Gen_Physician extends Doctor {
    public Gen_Physician(String name) {
        super(name, "General Physician");
    }
    public void diagnose(Patient_Reg patient) { //override
        System.out.println("Dr. " + name + " (" + specialization + ") diagnosed " +
                patient.get_Name() + " for illness: " + patient.get_Illness() +
                " with general treatment.");
    }
}
class Cardiologist extends Doctor {
    public Cardiologist(String name) {
        super(name, "Cardiologist");
    }
    public void diagnose(Patient_Reg patient) { //override
        if (patient.get_Illness().toLowerCase().contains("heart")) {
            System.out.println("Dr. " + name + " (" + specialization + ") diagnosed " +
                    patient.get_Name() + " for heart-related issue: " + patient.get_Illness());
        } else {
            System.out.println("Dr. " + name + " (" + specialization + ") referred " +
                    patient.get_Name() + " to another specialist.");
        }
    }
}


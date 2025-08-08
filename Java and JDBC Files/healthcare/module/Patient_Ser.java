package com.healthcare.module;
//interface
public interface Patient_Ser {
    void reg_Patient(Patient_Reg patient);
    void show_Patient_Details();
    Patient_Reg[] get_Patients();
}

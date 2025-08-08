package com.healthcare.module;

public class H_C_Main {
    public static void main(String[] args) {
        Patient_Ser_Imp service = new Patient_Ser_Imp(5);

        //for Register Patients
        Patient_Reg p1 = new Patient_Reg(1, "Aman", 22, "Cold and Fever");
        Patient_Reg p2 = new Patient_Reg(2, "Ashsish", 23, "Heart related problem");
        service.reg_Patient(p1);
        service.reg_Patient(p2);

        //for Show Patient Details
        service.show_Patient_Details();

        //for Doctors
        Doctor general = new Gen_Physician("Vishal");
        Doctor cardio = new Cardiologist("Karan");

        System.out.println("\nDiagnosis ");
        for (int i = 0; i < service.get_Count(); i++) {
            Patient_Reg p = service.get_Patients()[i];
            general.diagnose(p);
            cardio.diagnose(p);
        }
    }
}

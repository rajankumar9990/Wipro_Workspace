package wd;

class Patient {
    private String name;       //protected
    private String healthCondition; //protected

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public void setHealthCondition(String condition) {
        this.healthCondition = condition;
    }

  
    public String getHealthCondition(boolean authorized) {
        if (authorized) {
            return healthCondition;
        } else {
            return "Access Denied!";
        }
    }
}

public class Encap_Patient {
    public static void main(String[] args) {
        Patient p = new Patient();

        p.setName("Aman Singh");
        p.setHealthCondition("Diabetes");

        System.out.println("Patient Name is " + p.getName());


        System.out.println("Health Information is " + p.getHealthCondition(false));


        System.out.println("Health Informtaion (Doctor): " + p.getHealthCondition(true));
    }
}

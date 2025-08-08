package wd;

public class Local_Var_Ex {
	public void display() {
        int localNum = 50; // local variable
        System.out.println("Local variable value: " + localNum);
    }

    public static void main(String[] args) {
    	//System.out.println(localnum); Local Variable cannot be accessible directly outside the method block
        Local_Var_Ex obj = new Local_Var_Ex();
        obj.display();

    
    }

}

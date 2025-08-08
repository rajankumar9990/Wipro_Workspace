package wd;

public class var_types{
  
    int a = 100; //instance variable

    
    static int b=20; //static variable

    public static void main(String[] args) {

        int c = 80; //local variable

        System.out.println("Static Variable= " + b);
        System.out.println("Local Variable= " + c);
        
        var_types obj = new var_types();
        System.out.println("Instance Variable: " + obj.a);
    }
}

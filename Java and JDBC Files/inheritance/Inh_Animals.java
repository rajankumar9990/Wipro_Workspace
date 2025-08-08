package inheritance;


class Animal {
    String name;
    String living;

    void setDetails(String n, String l) {
        name = n;
        living = l;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Living Place : " + living);
    }

    void sound() {
        System.out.println("The animal makes a sound.");
    }
}


class Bird extends Animal {
 
    void sound() {
        System.out.println(name + " chirps and sings melodiously.");
    }
}


class Mammal extends Animal {

    void sound() {
        System.out.println(name + " makes different mammal sounds.");
    }
}


class Reptile extends Animal {

    void sound() {
        System.out.println(name + " hisses or makes reptilian sounds.");
    }
}


public class Inh_Animals {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.setDetails("Sparrow", "Garden");

        Mammal m = new Mammal();
        m.setDetails("Tiger", "Forest");

        Reptile r = new Reptile();
        r.setDetails("Snake", "Desert");

        b.showDetails();
        b.sound();

        System.out.println();

        m.showDetails();
        m.sound();

        System.out.println();

        r.showDetails();
        r.sound();
    }
}

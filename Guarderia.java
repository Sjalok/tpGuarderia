import java.util.ArrayList;

public class Guarderia {
    private final String nombre = "La guarderia de Carlitos!";

    private ArrayList<Animal> animalesEnGuarderia = new ArrayList<Animal>();

    public Guarderia() {
    }

    public Guarderia(ArrayList<Animal> i) {
        this.animalesEnGuarderia = animalesEnGuarderia;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Animal> getAnimalesEnGuarderia() {
        return animalesEnGuarderia;
    }

    public void agregarAnimal (Animal i) {
        animalesEnGuarderia.add(i);
    }

//    public void sacarAnimal (Animal i.getNombre) {
//
//    }

    @Override
    public String toString() {
        return "Guarderia: " + nombre + " y los animales existentes en la guarderia son: " + animalesEnGuarderia;
    }
}



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

    public void retirarAnimal (String nombreanimal,String nombredueño, int dni) {
        for (Animal animal: animalesEnGuarderia) {
            if (nombreanimal.equals(animal.getNombre()) && nombredueño.equals(animal.getDueño().getNombre()) && dni == animal.getDueño().getDni()) {
                animalesEnGuarderia.remove(animal);
                System.out.println("Perfecto " + nombredueño + " su animal ha sido retirado con exito!");
                return;
            }
        }
        System.out.println("Ocurrio un error, no tienes el animal " + nombreanimal + " o su dni es incorrento, no sea un rufian y no se haga pasar por alguien!");
        return;
    }

    public int cantAnimales() {
        int cantAnimales = 0;
        for (Animal i: animalesEnGuarderia) {
            cantAnimales = cantAnimales + 1;
        }
        return cantAnimales;
    }

    public void imprimirAnimales() {
        for (Animal i: animalesEnGuarderia) {
            System.out.println(i.toString());
        }
    }

    @Override
    public String toString() {
        return "\nLos animales registrados actualmente en la guarderia son: " +
                "\n" + animalesEnGuarderia;
    }
}



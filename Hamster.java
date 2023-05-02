public class Hamster extends Animal{
    private final String tipoDeAnimal = "hamster";

    public Hamster() {
    }

    public Hamster(String nombre, int edad, Dueño dueño, char sexo, float peso) {
        super(nombre, edad, dueño, sexo, peso);
    }



    @Override
    public String toString() {
        String aux;
        if (getSexo() == 'm' || getSexo() == 'M') {
            aux = "macho";
        } else {
            aux = "hembra";
        }
        return "\nhamster de nombre: " + getNombre() +
                "\nedad: " + getEdad() +
                "\nel dueño es: " + getDueño().getNombre() +
                "\nsexo: " + aux +
                "\npeso: " + getPeso() +
                "\n---------------------------------------------------------------------------";
    }

    @Override
    public String saludar() {
        return "Hola me llamo " + getNombre() + ", soy un " + tipoDeAnimal + " y mi dueño es: " + getDueño().getNombre() +
                "\n------------------------------------------------------";
    }
}

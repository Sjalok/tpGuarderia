public class Hamster extends Animal{
    private final String tipoDeAnimal = "hamster";

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
        return "El perro se llama " + getNombre() + ", tiene " + getEdad() + ", el dueño es: " + getDueño().getNombre() +
                " es de sexo " + aux + " y pesa " + getPeso() +
                "\n---------------------------------------------------------------------------";
    }
}

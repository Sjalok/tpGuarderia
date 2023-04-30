public class Gato extends Animal {
    private final String tipoDeAnimal = "gato";
    public Gato(String nombre, int edad, Dueño dueño, char sexo, float peso) {
        super(nombre, edad, dueño, sexo, peso);
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    @Override
    public String toString() {
        String aux;
        if (getSexo() == 'm' || getSexo() == 'M') {
            aux = "macho";
        } else {
            aux = "hembra";
        }
        return "El gato se llama " + getNombre() + ", tiene " + getEdad() + ", el dueño es: " + getDueño().getNombre() +
                " es de sexo " + aux + " y pesa " + getPeso() +
                "\n---------------------------------------------------------------------------";
    }
}

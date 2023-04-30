public class Perro extends Animal {
    private final String tipoDeAnimal = "perro";
    private String raza;

    public Perro(String nombre, int edad, Dueño dueño, char sexo, float peso, String raza) {
        super(nombre, edad, dueño, sexo, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
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
                " es de sexo " + aux + ", pesa " + getPeso() + " y es de raza " + this.raza +
                "\n---------------------------------------------------------------------------";
    }
}

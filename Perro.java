public class Perro extends Animal {
    private final String tipoDeAnimal = "perro";
    private String raza;


    public Perro() {
    }

    public Perro(String nombre, int edad, Dueño dueño, char sexo, float peso, String raza) {
        super(nombre, edad, dueño, sexo, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        String aux;
        if (getSexo() == 'm' || getSexo() == 'M') {
            aux = "macho";
        } else {
            aux = "hembra";
        }
        return "\nperro de nombre " + getNombre() +
                "\nedad: " + getEdad()  +
                "\nel dueño es: " + getDueño().getNombre() +
                "\nsexo: " + aux +
                "\npeso en gramos: " + getPeso() + "" +
                "\nraza: " + this.raza +
                "\n---------------------------------------------------------------------------";
    }

    @Override
    public String saludar() {
        return "Hola me llamo " + getNombre() + ", soy un " + tipoDeAnimal + " y mi dueño es: " + getDueño().getNombre() +
                "\n------------------------------------------------------";
    }
}

public class Mojarrita extends Animal {
    private final String tipoDeAnimal = "mojarrita";

    private tipoDeAgua tipodeagua;

    public Mojarrita(String nombre, int edad, Dueño dueño, char sexo, float peso, String i) {
        super(nombre, edad, dueño, sexo, peso);
        i = i.toLowerCase();
        if (i == "fria") {
            this.tipodeagua = tipoDeAgua.FRIA;
        } else if (i == "tropical") {
            this.tipodeagua = tipoDeAgua.TROPICAL;
        }
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
                " es de sexo " + aux + ", pesa " + getPeso() + " y es de agua " + this.tipodeagua +
                "\n---------------------------------------------------------------------------";
    }

    enum tipoDeAgua {FRIA, TROPICAL}



}

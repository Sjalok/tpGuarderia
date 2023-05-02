public class Mojarrita extends Animal {
    private final String tipoDeAnimal = "mojarrita";

    private tipoDeAgua tipodeagua;

    public Mojarrita() {
    }

    public Mojarrita(String nombre, int edad, Dueño dueño, char sexo, float peso, String i) {
        super(nombre, edad, dueño, sexo, peso);
        i = i.toLowerCase();
        if (i == "fria") {
            this.tipodeagua = tipoDeAgua.FRIA;
        } else if (i == "tropical") {
            this.tipodeagua = tipoDeAgua.TROPICAL;
        }
    }

    public void setTipodeagua(String i) {
        String x = i.toLowerCase();
        if (x == "tropical") {
            this.tipodeagua = tipoDeAgua.TROPICAL;
        } else {
            this.tipodeagua = tipoDeAgua.FRIA;
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
        return "\nMojarra de nombre: " + getNombre() +
                "\nedad: " + getEdad() +
                "\nel dueño es: " + getDueño().getNombre() +
                "\nsexo: " + aux +
                "\npeso: " + getPeso() +
                "\nel tipo de agua: " + this.tipodeagua +
                "\n---------------------------------------------------------------------------";
    }

    @Override
    public String saludar() {
        return "Hola me llamo " + getNombre() + ", soy una " + tipoDeAnimal + " y mi dueño es: " + getDueño().getNombre() +
                "\n------------------------------------------------------";
    }

    enum tipoDeAgua {FRIA, TROPICAL}



}

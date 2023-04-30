public class Animal {
    private String nombre;
    private int edad;
    private Dueño dueño;
    private char sexo;
    private float peso;
    private String tipoDeAnimal;
    private boolean estaEnGuarderia;

    public String saludar () {
        return "Hola me llamo " + nombre + ", soy un/a " + tipoDeAnimal + " y mi dueño es: " + this.dueño.getNombre() +
                "\n------------------------------------------------------";
    }

    public Animal(String nombre, int edad, Dueño dueño, char sexo, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueño = dueño;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isEstaEnGuarderia() {
        return estaEnGuarderia;
    }

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }
}

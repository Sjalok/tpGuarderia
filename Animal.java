import java.util.HashSet;

public abstract class Animal {
    private String nombre;
    private int edad;
    private Dueño dueño;
    private char sexo;
    private float peso;
    private String tipoDeAnimal;


    public Animal() {
    }

    public abstract String saludar();

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

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void asignarDueño(HashSet<Dueño> usuarios, String i) {
        for (Dueño usuario: usuarios) {
            if (usuario.getNombre().equals(i)) {
                this.dueño = usuario;
            }
        }
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}

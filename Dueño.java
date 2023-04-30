public class Dueño {
    private int dni;
    private String nombre;
    private String direccion;

    public Dueño() {
    }

    public Dueño(int dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}

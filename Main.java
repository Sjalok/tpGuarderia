import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int aux2;
        boolean aux = true;

        HashSet<Dueño> usuarios = new HashSet<Dueño>();

        Dueño marcia = new Dueño(39545343, "Marcia", "San juan 254");
        usuarios.add(marcia);
        Dueño stefano = new Dueño(42435870,"Stefano","Neuquen 853");
        usuarios.add(stefano);
        Dueño xaby = new Dueño(44626106,"Xabier","Fitz roy 462");
        usuarios.add(xaby);
        Dueño emiliano = new Dueño(37549292,"Emiliano","Zapiola 3851");
        usuarios.add(emiliano);
        Dueño franco = new Dueño(40065794,"Franco","Avenida Alem 1518");
        usuarios.add(franco);
        Dueño pame = new Dueño(38654932,"Pamela","Santa Fe 928");
        usuarios.add(pame);

        Perro corintio = new Perro("Corintio",5,marcia,'m',11200,"Bulldog");
        guarderia.agregarAnimal(corintio);
        Perro hefesto = new Perro("Hefesto",11,stefano,'m',30540,"Ovejero aleman");
        guarderia.agregarAnimal(hefesto);
        Perro dionisio = new Perro("Dionisio",3,emiliano,'m',22900,"Labrador");
        guarderia.agregarAnimal(dionisio);
        Perro hera = new Perro("Hera",14,emiliano,'h',25200,"Beagle");
        guarderia.agregarAnimal(hera);
        Perro coco = new Perro("Coco",7,pame,'m',7400,"Caniche");
        guarderia.agregarAnimal(coco);
        Perro kala = new Perro("Kala",5,pame,'h',17600,"Labrador");
        guarderia.agregarAnimal(kala);
        Gato kiro = new Gato("Kiro",3,marcia,'h',3200);
        guarderia.agregarAnimal(kiro);
        Gato caramelo = new Gato("Caramelo",8,xaby,'m',3100);
        guarderia.agregarAnimal(caramelo);
        Gato otto = new Gato("Otto",5,xaby,'m',3500);
        guarderia.agregarAnimal(otto);
        Gato freddy = new Gato("Freddy",4,franco,'m',3000);
        guarderia.agregarAnimal(freddy);
        Gato milo = new Gato("Milo",2,pame,'m',4010);
        guarderia.agregarAnimal(milo);
        Hamster hermes = new Hamster("Hermes",1,marcia,'m',32);
        guarderia.agregarAnimal(hermes);
        Hamster atenea = new Hamster("Atenea",2,stefano,'h',35);
        guarderia.agregarAnimal(atenea);
        Hamster demeter = new Hamster("Demeter",3,emiliano,'m',40);
        guarderia.agregarAnimal(demeter);
        Hamster rrraton = new Hamster("Rrraton",1,pame,'m',150);
        guarderia.agregarAnimal(rrraton);
        Mojarrita odin = new Mojarrita("Odin",1,marcia,'m',320,"fria");
        guarderia.agregarAnimal(odin);
        Mojarrita frigg = new Mojarrita("Frigg",2,stefano,'h',310,"tropical");
        guarderia.agregarAnimal(frigg);
        Mojarrita balder = new Mojarrita("Balder",1,emiliano,'m',370,"tropical");
        guarderia.agregarAnimal(balder);
        Mojarrita skadi = new Mojarrita("Skadi",2,franco,'h',380,"fria");
        guarderia.agregarAnimal(skadi);

        // el menu va a contar con 6 opciones
        do {
            Dueño corriente = new Dueño();

            if (aux == true) {
                System.out.println("-----------------------------------------");
                System.out.println("|Bienvenidos a " + guarderia.getNombre() + "|");
                System.out.println("-----------------------------------------");
                System.out.println(" ");
                boolean auxiliar = false;
                String ayuda = null;
                System.out.printf("Antes que nada, por favor ingrese su DNI: ");
                aux2 = sc.nextInt();
                for (Dueño usuario: usuarios) {
                    if (aux2 == usuario.getDni()) {
                        auxiliar = true;
                        ayuda = usuario.getNombre();
                    }
                }
                if (auxiliar == true) {
                    System.out.println("Bienvenido/a " + ayuda);
                } else {
                    System.out.println("Lo sentimos! pero tiene que registrarse para usar nuestro sistema!");
                    System.out.printf("Desea registrarse ahora? ( 1 para registrarse, 2 para no registrarse ): ");
                    aux2 = sc.nextInt();
                    if (aux2 == 1) {
                        System.out.println("hola");
                    } else {
                        System.out.println("Gracias igual, vuelva prontos!");
                        break;
                    }
                }
            }

            if (aux == true) {

            }

            aux = false;

            System.out.println("Las opciones a realizar son: ");
            System.out.println("0 para salir");
            System.out.println("1 para ingresar un animal a la guarderia");
            System.out.println("2 para retirar un animal de la guarderia");
            System.out.println("3 cantidad de animales que hay en la guarderia");
            System.out.println("4 para listar toda la informacion de todos los animales en la guarderia");
            System.out.printf("5 para hacer saludar a todos los animales de la guarderia (que educados son!) : ");
            opcion = sc.nextInt();

            if (opcion == 0) {
                System.out.println("Gracias por utilizar nuestro sistema, vuelva prontos!");
            }

            if (opcion == 1) {

            }

            if (opcion == 5) {
                for (Animal i: guarderia.getAnimalesEnGuarderia()) {
                    i.saludar();
                }
            }

        } while (opcion > 0 && opcion < 7);

    }
}
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia();
        Scanner sc = new Scanner(System.in);
        int opcion;
        int aux2;
        String nombre = null;
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
            int nroDni = 0;
            Dueño corriente = new Dueño();
            Perro perro = new Perro();
            Gato gato = new Gato();
            Hamster hamster = new Hamster();
            Mojarrita mojarra = new Mojarrita();



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
                        nombre = usuario.getNombre();
                        break;
                    }
                }
                if (auxiliar == true) {
                    System.out.println("Bienvenido/a " + nombre);
                    System.out.println(" ");
                } else {
                    System.out.println("Lo sentimos! pero tiene que registrarse para usar nuestro sistema!");
                    System.out.printf("Desea registrarse ahora? ( 1 para registrarse, 2 para no registrarse ): ");
                    aux2 = sc.nextInt();
                    if (aux2 == 1) {
                        String aux3;
                        System.out.printf("Nombre? ");
                        nombre = sc.next();
                        corriente.setNombre(nombre);
                        System.out.print("Direccion? ");
                        sc.nextLine();
                        aux3 = sc.nextLine();
                        corriente.setDireccion(aux3);
                        System.out.printf("y, por ultimo, numero de dni? ");
                        nroDni = sc.nextInt();
                        corriente.setDni(nroDni);
                        System.out.println("Ocurrio un error, tiene que ser un valor de enteros, no de otro tipo de dato!");
                        System.out.println(" ");
                        usuarios.add(corriente);
                        System.out.println(" ");
                        System.out.println("Gracias " + corriente.getNombre() + " por registrarte! en seguida te habilitamos las opciones!");
                        System.out.println(" ");
                    } else {
                        System.out.println("Gracias igual, vuelva prontos!");
                        break;
                    }
                }
            }

            aux = false;

            System.out.println("Las opciones a realizar son: ");
            System.out.println("0 para salir");
            System.out.println("1 para ingresar un animal a la guarderia");
            System.out.println("2 para retirar un animal de la guarderia");
            System.out.println("3 cantidad de animales que hay en la guarderia");
            System.out.println("4 para listar toda la informacion de todos los animales en la guarderia");
            System.out.println("5 para hacer saludar a todos los animales de la guarderia (que educados son!) ");
            System.out.printf("6 para desalojar todos los animales! ( quedan a cargo tuyo ): ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                String ayuda;
                char ayuda2;
                float ayuda3;
                do {
                    System.out.printf("Que animal es? recuerde que la guarderia acepta solo perros, gatos, hamsters y mojarritas: ");
                    ayuda = sc.next().toLowerCase();
                    if (ayuda.equals("perro") || ayuda.equals("gato") || ayuda.equals("hamster") || ayuda.equals("mojarrita")) {
                        break;
                    } else {
                        System.out.println("Ingreso el dato mal, por favor vuelva a intentarlo!");
                    }
                } while (true);
                System.out.println(" ");

                if (ayuda.equals("perro")) {
                    System.out.printf("Nombre del perro? ");
                    ayuda = sc.next();
                    perro.setNombre(ayuda);
                    System.out.printf("Edad? ");
                    aux2 = sc.nextInt();
                    perro.setEdad(aux2);
                    perro.asignarDueño(usuarios, nombre);
                    System.out.printf("Sexo? m para macho, h para hembra: ");
                    ayuda2 = sc.next().charAt(0);
                    perro.setSexo(ayuda2);
                    System.out.printf("Peso del animal? ");
                    ayuda3 = sc.nextFloat();
                    perro.setPeso(ayuda3);
                    System.out.printf("Raza del perro? ");
                    ayuda = sc.next();
                    perro.setRaza(ayuda);
                    guarderia.agregarAnimal(perro);
                }

                if (ayuda.equals("gato")) {
                    System.out.printf("Nombre del gato? ");
                    ayuda = sc.next();
                    gato.setNombre(ayuda);
                    System.out.printf("Edad? ");
                    aux2 = sc.nextInt();
                    gato.setEdad(aux2);
                    gato.asignarDueño(usuarios, nombre);
                    System.out.printf("Sexo? m para macho, h para hembra: ");
                    ayuda2 = sc.next().charAt(0);
                    gato.setSexo(ayuda2);
                    System.out.printf("Peso del animal? ");
                    ayuda3 = sc.nextFloat();
                    gato.setPeso(ayuda3);
                    guarderia.agregarAnimal(gato);
                }

                if (ayuda.equals("hamster")) {
                    System.out.printf("Nombre del hamster? ");
                    ayuda = sc.next();
                    hamster.setNombre(ayuda);
                    System.out.printf("Edad? ");
                    aux2 = sc.nextInt();
                    hamster.setEdad(aux2);
                    hamster.asignarDueño(usuarios, nombre);
                    System.out.printf("Sexo? m para macho, h para hembra: ");
                    ayuda2 = sc.next().charAt(0);
                    hamster.setSexo(ayuda2);
                    System.out.printf("Peso del animal? ");
                    ayuda3 = sc.nextFloat();
                    hamster.setPeso(ayuda3);
                    guarderia.agregarAnimal(hamster);
                }

                if (ayuda.equals("mojarrita")) {
                    System.out.printf("Nombre de la mojarrita? ");
                    ayuda = sc.next();
                    mojarra.setNombre(ayuda);
                    System.out.printf("Edad? ");
                    aux2 = sc.nextInt();
                    mojarra.setEdad(aux2);
                    mojarra.asignarDueño(usuarios, nombre);
                    System.out.printf("Sexo? m para macho, h para hembra: ");
                    ayuda2 = sc.next().charAt(0);
                    mojarra.setSexo(ayuda2);
                    System.out.printf("Peso del animal? ");
                    ayuda3 = sc.nextFloat();
                    mojarra.setPeso(ayuda3);
                    System.out.printf("La mojarrita es de agua fria o tropical? ");
                    ayuda = sc.next().toLowerCase();
                    mojarra.setTipodeagua(ayuda);
                    guarderia.agregarAnimal(mojarra);
                }

                System.out.println(nombre + ", Su animal ha sido ingresado con exito!");
                System.out.println(" ");

            }

            if (opcion == 2) {
                System.out.println("Los animales que tienes actualmente en la guarderia son");
                guarderia.imprimirAnimalesSegunDueño(nombre);
                String nombreAnimal;
                System.out.printf(nombre + ", cual es el nombre del animal que deseas retirar? ");
                nombreAnimal = sc.next();
                System.out.printf("Y solo por asegurar, que numero de dni tenes? ");
                aux2 = sc.nextInt();
                guarderia.retirarAnimal(nombreAnimal,nombre,aux2);
            }

            if (opcion == 3) {
                System.out.println("La cantidad de animales es de: " + guarderia.cantAnimales());
                System.out.println(" ");
            }

            if (opcion == 4) {
              guarderia.imprimirAnimales();
            }

            if (opcion == 5) {
                for (Animal i: guarderia.getAnimalesEnGuarderia()) {
                    System.out.println(i.saludar());
                }
            }

            if (opcion == 6) {
                guarderia.desalojarAnimales();
                System.out.println("Se han desalojado todos los animales! hacete cargo vos " + nombre);
            }

            if (opcion < 0 || opcion > 6) {
                System.out.println("Marcaste mal la opcion! por favor vuelva a intentar!");
                System.out.println(" ");
            }

        } while (opcion != 0);

        System.out.println("Gracias por usar nuestro sistema! vuelva prontos!");
    }
}
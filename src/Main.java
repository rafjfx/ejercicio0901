public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        {
            cliente.edad = 30;
            cliente.telefono = "12345678";
            cliente.nombre = "Juan";
            cliente.credito = 1000;
            System.out.println("Nombre : " + cliente.nombre +
                    " Edad : " + cliente.edad +
                    " Telefono : " + cliente.telefono +
                    " Credito : " + cliente.credito);
        }

        Trabajador trabajador = new Trabajador();
        {
            trabajador.edad = 30;
            trabajador.telefono = "12345678";
            trabajador.nombre = "Juan";
            trabajador.salario = 2000;
            System.out.println("Nombre : " + trabajador.nombre +
                    " Edad : " + trabajador.edad +
                    " Telefono : " + trabajador.telefono +
                    " Salario : " + trabajador.salario);
        }
    }
}
class Persona {
    int edad;
    String nombre;
    String telefono;
}
class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    int salario;
}
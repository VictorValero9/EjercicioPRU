import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Jorge", 1);
        Manager manager = new Manager("Mauro",9);
        Cliente cliente = new Cliente("Pedro", 52);

        Database database = new FakeDB();

        database.save(empleado);
        database.save(manager);
        database.save(cliente);

        Printer printer = new Printer();

        printer.imprimirInfo(empleado);
        printer.imprimirInfo(manager);
        printer.imprimirInfo(cliente);
    }
}
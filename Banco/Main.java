

public class Main {

    public static void main(String[] args) {
        Cuenta miCuenta;
        double ingreso = 600;
        double retiro = 2000;
        //prueba

        miCuenta = new Cuenta("Antonio López", "1000-2365-85-1230456789", 2500);
        System.out.println(miCuenta.toString());
        System.out.println("\nEl saldo actual es: "+ miCuenta.saldo);

        try {
        	System.out.println("Retiramos " + retiro + " en cuenta");
            miCuenta.retirar(retiro);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingresamos " + ingreso + " en cuenta");
            miCuenta.ingresar(ingreso);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        System.out.println("El saldo actual es: "+ miCuenta.saldo);
    }
}

public class AireAcondicionado implements Controlable {
    public void ejecutarAccion(String comando) {
        if (comando.equals("encender")) {
            System.out.println("aire acondicionado a 24 grados");
        } else if (comando.equals("apagar")) {
            System.out.println("aire acondicionado apagado");
        }
    }
}
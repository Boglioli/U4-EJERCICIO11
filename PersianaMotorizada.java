public class PersianaMotorizada implements Controlable {
    @Override
    public void ejecutarAccion(String comando) {
        if (comando.equals("encender")) {
            System.out.println("persiana abierta");
        } else if (comando.equals("cerrar")) {
            System.out.println("persiana cerrada");
        }
    }
}

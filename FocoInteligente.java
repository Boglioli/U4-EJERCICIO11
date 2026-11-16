public class FocoInteligente implements Controlable{
    @Override
    public void ejecutarAccion(String comando) {
        if (comando.equals("encender")) {
            System.out.println("foco encendido");
        } else if (comando.equals("apagar")) {
            System.out.println("foco apagado");
        }
    }
}

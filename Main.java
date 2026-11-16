public class Main {
    public static void main(String[] args) {
        Controlable[] dispositivos = new Controlable[3];
        dispositivos[0] = new FocoInteligente();
        dispositivos[1] = new AireAcondicionado();
        dispositivos[2] = new PersianaMotorizada();
        HubCentral hub = new HubCentral(dispositivos);
        System.out.println("encendido dispositivos");
        hub.enviarComandos("encender");
        System.out.println("--------------------");
        System.out.println("apagando dispositivos");
        hub.enviarComandos("apagar");
        System.out.println("--------------------");
        System.out.println("abriendo persiana");
        dispositivos[2].ejecutarAccion("abrir");
    }
}

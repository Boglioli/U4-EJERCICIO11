public class HubCentral {
    private Controlable[] dispositivos;
    public HubCentral(Controlable[] dispositivos) {
        this.dispositivos = dispositivos;
    }
    public void enviarComandos(String comando) {
        for (int i = 0; i < dispositivos.length; i++) {
            dispositivos[i].ejecutarAccion(comando);
        }
    }
}

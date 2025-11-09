public class Motor {
    private String tipo;
    private int caballos;

    public Motor(String tipo, int caballos) {
        this.tipo = tipo;
        this.caballos = caballos;
    }
    public void inyectarCarburante(){
        System.out.println("Inyectando carburante al motor " + tipo + " de " + caballos + " caballos.");
    }
}


public class Rueda {
    private double diametro;
    private String fabricante;

    public Rueda  (double diametro, String fabricante){
        this.diametro = diametro;
        this.fabricante = fabricante;
    }

    public void girar(){
        System.out.println("La rueda de " + diametro + " pulgadas del fabricante " + fabricante + " está girando.");
    }

}

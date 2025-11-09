public class ClaseP1 {
    public static void main(String[] args) {
        
        Rueda[] ruedas = {new Rueda(20,"Dunlop"),
        new Rueda(20,"Dunlop"),
        new Rueda(22, "Dunlop"),
        new Rueda(22, "Dunlop")};
        
        Coche miCoche = new Coche("verde", 80, 3.2f, ruedas, new Motor("diesel", 1600));
        
        miCoche.avanzar();
        
    }
}

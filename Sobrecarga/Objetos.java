public class Objetos {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Verde", 80, 3.2f);
        Coche tuCoche = new Coche("Rojo", 120, 4.1f);
        Coche suCoche = new Coche("Amarillo", 100, 3.4f); 

        miCoche.avanzar();
        tuCoche.avanzar(1000);
        suCoche.avanzar(1000, 120);
        
    }
}

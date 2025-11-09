public class Coche {
    private String color;
  private int velocidad;
  private float tamaño;
  
  public Coche(String color, int velocidad, float tamaño){
    this.color = color;
    this.velocidad = velocidad;
    this.tamaño = tamaño;
  }

  public void avanzar(){
    System.out.println("El coche de color " + this.color + " está avanzando a su velocidad base de " + this.velocidad + " km/h.");
  }
  public void avanzar(int metros){
    System.out.println("El coche de color " + this.color + " ha comenzado a avanzar y recorrerá " + metros + " metros.");
  }
  public void avanzar(int metros, int velocidad){
    System.out.println("El coche de color " + this.color + " avanzará " + metros + " metros a una velocidad de " + velocidad + " km/h.");
  }

  public void parar(){}
  public void girarIzquierda(){}
  public void girarDerecha(){}
}

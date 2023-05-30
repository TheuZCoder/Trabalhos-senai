package POOInterface;
public class App{
    public static void main(String[] args) {

    quadrado figura1 = new quadrado(8);
    System.out.println(figura1.getNomeFigura() + " Area: "+figura1.getArea()+ " Perimetro: "+figura1.getPerimetro());
    retangulo figura2 = new retangulo(10, 5);
    System.out.println(figura2.getNomeFigura() + " Area: "+figura2.getArea()+ " Perimetro: "+figura2.getPerimetro());
    trapezio figura3 = new trapezio(10, 5, 5,   10  , 10);
    System.out.println(figura3.getNomeFigura()+ " Area: "+figura3.getArea()+ " Perimetro: "+figura3.getPerimetro());
    }

}

package POOInterface;

public class trapezio implements FigurasGeometricas{
    int baseMaior;
    int baseMenor;
    int altura;
    int lado1;
    int lado2;

    public trapezio(int baseMaior, int baseMenor, int altura, int lado1, int lado2) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        return ((baseMaior+baseMenor)*altura)/2;
    }

    @Override
    public String getNomeFigura() {
        return "Trapézio";
    }

    @Override
    public double getPerimetro() {
        return lado1+lado2+baseMaior+baseMenor;
    }


}

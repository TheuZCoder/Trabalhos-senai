package POOInterface;

public class quadrado implements FigurasGeometricas{
    //atributos classe quadrado
    int lado;
    //construtor da classe quadrado
    public quadrado(int lado) {
        this.lado = lado;
    }
    // metodos importador de figurasgeometricas
    
    @Override
    public double getArea() {
        int area = lado*lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = 4*lado;
        return perimetro;
    }
    //declara os metodos da clase figurasgeometricas
    
}

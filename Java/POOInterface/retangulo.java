package POOInterface;

public class retangulo implements FigurasGeometricas {
    //atributos retangulo
    int base;
    int altura;
    //construtor
    public retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //metodos override
    @Override
    public double getArea() {
        return base*altura;
    }
    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }
    @Override
    public double getPerimetro() {
        return (base*altura)*2;
    }
    
}

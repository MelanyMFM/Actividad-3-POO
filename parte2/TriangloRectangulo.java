package parte2;

public class TriangloRectangulo {
    int base;
    int altura;
    
    public TriangloRectangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
    }
    
    double calcularArea(){
    return (base * altura)/2;
    }
    
    double calcularHipotenusa(){
        return Math.pow(base*base+altura*altura, 0.5);
    }
    
    double calcularPerimetro(){
    return base + altura + calcularHipotenusa();
    }
    
    String tipoDeTriangulo(){
    String tipo = "Triangulo Isosceles";
    
    if (base != altura){
    tipo = "Triangulo Escaleno";}
    return tipo;
    }
}

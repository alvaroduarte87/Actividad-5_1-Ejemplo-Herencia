public class Programador extends Empleado {

    private String lenguajeDominante;

    public Programador(String nombre, double salarioBase, String lenguajeDominante) {
        super(nombre, salarioBase);
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public double calcularSalario() {
        double salarioPadre = super.calcularSalario();
        return salarioPadre + salarioPadre * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lenguaje Dominante: " + lenguajeDominante;
    }
}
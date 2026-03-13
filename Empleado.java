public class Empleado {
    protected String nombre;
    protected Double salarioBase;

    public Empleado(String nombre, Double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Salario Base: " + salarioBase;
    }
}





    



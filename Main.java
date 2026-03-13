
public class Main {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Ana", 1500.0);
        Programador p1 = new Programador("Luis", 2000.0, "Java");
        Gerente g1 = new Gerente("Marta", 2500.0, "IT");

        System.out.println(e1);
        System.out.println("Salario final: " + e1.calcularSalario());

        System.out.println();

        System.out.println(p1);
        System.out.println("Salario final: " + p1.calcularSalario());

        System.out.println();

        System.out.println(g1);
        System.out.println("Salario final: " + g1.calcularSalario());
    }
}
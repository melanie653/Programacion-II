class EmpleadoTiempoCompleto extends Empleado {
    private double salario_anual;
    public EmpleadoTiempoCompleto(String nombre, double salarioAnual) {
        super(nombre);
        this.salario_anual = salarioAnual;
    }
    @Override
    public double calcularSalarioMensual() {
        return salario_anual / 12;
    }
    @Override
    public String toString() {
        return super.toString() + ", Salario Anual: " + salario_anual +
               ", Salario Mensual: " + calcularSalarioMensual();
    }
}
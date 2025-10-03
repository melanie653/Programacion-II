class EmpleadoTiempoHorario extends Empleado {
    private double horas_trabajadas;
    private double tarifa_por_hora;
    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horas_trabajadas = horasTrabajadas;
        this.tarifa_por_hora = tarifaPorHora;
    }
    @Override
    public double calcularSalarioMensual() {
        return horas_trabajadas * tarifa_por_hora;
    }
    @Override
    public String toString() {
        return super.toString() + ", Horas: " + horas_trabajadas +
               ", Tarifa/Hora: " + tarifa_por_hora +
               ", Salario Mensual: " + calcularSalarioMensual();
    }
}

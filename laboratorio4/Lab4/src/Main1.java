public class Main1 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[5];
        empleados[0] = new EmpleadoTiempoCompleto("Ana", 48000);
        empleados[1] = new EmpleadoTiempoCompleto("Luis", 60000);
        empleados[2] = new EmpleadoTiempoCompleto("Carla", 72000);
        empleados[3] = new EmpleadoTiempoHorario("Pedro", 160, 15);
        empleados[4] = new EmpleadoTiempoHorario("Marta", 180, 20);

        for (Empleado e : empleados) {
            System.out.println(e.toString());
        }
    }
}
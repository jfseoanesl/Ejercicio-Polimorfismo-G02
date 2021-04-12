package Dominio;

public class EmpleadoAsalariado extends Empleado {
    private double pSemana;

    public EmpleadoAsalariado(double pSemana) {
        this.pSemana = pSemana;
    }

    public double getpSemana() {
        return pSemana;
    }

    public void setpSemana(double pSemana) {
        this.pSemana = pSemana;
    }

    @Override
    public double getLiquidacionMes() {
        return this.pSemana / 7 * 30;
    }
    
    
}

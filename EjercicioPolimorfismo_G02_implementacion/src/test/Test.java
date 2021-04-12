package test;

import Dominio.*;

public class Test {
    public static void main(String[] args) {
        
        Empleado e = new EmpleadoAsalariado(700);
        imprimirLiquidacionMes(e);
        
        Empleado eh = new EmpleadoPorHora(100, 150, 30);
        imprimirLiquidacionMes(eh);
    }
    
    public static void imprimirLiquidacionMes(Empleado e){
        System.out.println("Liquidacion mes: " + e.getLiquidacionMes());
    }
}

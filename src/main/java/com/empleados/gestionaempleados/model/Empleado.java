package com.empleados.gestionaempleados.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Empleado {

    private static final int VALOR_HORAS = 100000;
    private static final int VALOR_TIEMPO_COMPLETO = 2300000;
    private static final int VALOR_TIEMPO_COMPLETO_BONIFICADO = 45000;

    private String Nombre;
    private String Apellido;
    private String Email;
    private String Tipo_Contrato;
    private int Horas;
    private int Salario;
    private int BONOS;

    public int calculTotal(){
        if(this.Tipo_Contrato.equals("Horas") ){
            return this.Horas*VALOR_HORAS;
        }else if(this.Tipo_Contrato.equals("Tiempo Completo")){
            return this.Salario;
        }else if(this.Tipo_Contrato.equals("Tiempo Completo Bonif.")){
            int ttlBonos = this.BONOS*VALOR_TIEMPO_COMPLETO_BONIFICADO;
            return this.Salario+ttlBonos; 
        }
        return 0;
    }
}

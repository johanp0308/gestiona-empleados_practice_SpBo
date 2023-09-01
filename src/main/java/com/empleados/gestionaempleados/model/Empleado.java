package com.empleados.gestionaempleados.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Empleado {

    private static final int VALOR_HORAS = 80000;
    private static final int VALOR_BONOS = 10000;

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
        }else if(this.Tipo_Contrato.equals("Tiempo Completo ")){
            return this.Salario;
        }else if(this.Tipo_Contrato.equals("Tiempo Completo Bonif.")){
            return this.Salario+this.BONOS;
        }
        return 0;
    }
}

package com.empleados.gestionaempleados.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.empleados.gestionaempleados.model.Empleado;

@Controller
@RequestMapping("/app")
public class IndexController {
    
    @GetMapping({"/index","/home",})
    public String index(Model model){
        model.addAttribute("inicio", "Inicio");
        return "index";
    }

    @GetMapping("/empleados")
    public String empleados(Model model){
        model.addAttribute("empleados", "Empleados");
        List<Empleado> empleados = getAllEmpleados();
        model.addAttribute("empleadosList", empleados);
        return "empleados";
    }
    

    public List<Empleado> getAllEmpleados(){
        
        List<Empleado> empleados=new ArrayList<>();
        empleados.add(new Empleado("Juan", "Garcia", "juan@example.com", "Horas", 20, 15,0));
        empleados.add(new Empleado("Maria", "Lopez", "maria@example.com", "Tiempo Completo" ,0, 2300000,0));
        empleados.add(new Empleado("Carlos", "Pachon", "juan@example.com", "Tiempo Completo Bonif.", 0, 2300000,3));
        empleados.add(new Empleado("Laura", "Perez", "juan@example.com", "Horas", 20, 2300000,0));
        empleados.add(new Empleado("Andres", "Fernandez", "juan@example.com", "Tiempo Completo", 0, 2300000,0));
        empleados.add(new Empleado("Pedro", "Perez", "juan@example.com", "Tiempo Completo Bonif.", 0, 2300000,5));
        empleados.add(new Empleado("Sofia", "Perez", "juan@example.com", "Horas", 12, 0,0));
        empleados.add(new Empleado("Johan", "Perez", "juan@example.com", "Horas", 20, 0,0));
        empleados.add(new Empleado("Sebastian", "Lopez", "maria@example.com", "Tiempo Completo" ,0, 2300000,0));
        empleados.add(new Empleado("Jose", "Perez", "juan@example.com", "Tiempo Completo Bonif.", 0, 2300000,3));
        empleados.add(new Empleado("Godines", "Perez", "juan@example.com", "Horas", 20, 0,0));
        empleados.add(new Empleado("Jaider", "Perez", "juan@example.com", "Tiempo Completo", 0, 2300000,0));
        empleados.add(new Empleado("Cristina", "Perez", "juan@example.com", "Tiempo Completo Bonif.", 0, 2300000,5));
        empleados.add(new Empleado("Santiago", "Perez", "juan@example.com", "Horas", 12, 0,0));
        return empleados;
    }
}

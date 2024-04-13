package pe.edu.cibertec.appventascibertec.controller;

import org.apache.tomcat.util.modeler.BaseAttributeFilter;
import org.springframework.web.bind.annotation.ModelAttribute;
import pe.edu.cibertec.appventascibertec.model.MesModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mes")

public class NombreMes {

    @GetMapping("/nombre")
    public String mostrarFormulario(Model model) {
        model.addAttribute("mesModel", new MesModel());
        model.addAttribute("mostrarMensaje", false);
        return "nombre-mes";
    }

    @PostMapping("/obtenerNombre")
    public String obtenerNombreMes(@ModelAttribute("mesModel") MesModel mesModel,
                                   Model model) {
        int numero = mesModel.getNumero();
        String nombre = obtenerNombreMesPorNumero(numero);
        model.addAttribute("nombreMes", nombre);
        return "resultado-nombre-mes";
    }

    private String obtenerNombreMesPorNumero (int numero) {
        String[] nombres = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        if (numero >= 1 && numero <= 12) {
            return nombres[numero - 1];
        } else {
            return "Número de mes inválido";
        }

       // model.addAttribute("mostrarMensaje", true);
        //model.addAttribute("numero", numero);
       // model.addAttribute("nombreMes", obtenerNombreMesPorNumero(numero));



         //   return "nombreMes";

    }


}


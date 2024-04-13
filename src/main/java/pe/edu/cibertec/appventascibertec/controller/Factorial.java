package pe.edu.cibertec.appventascibertec.controller;
import pe.edu.cibertec.appventascibertec.model.FactorialModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Factorial {

    @GetMapping("/")
    public String mostrarFormulario() {
        return "formulario";
    }

    @PostMapping("/calcular")
    public String calcularFactorial(@RequestParam("numero") int numero, Model model) {
        long factorial = FactorialModel.calcularFactorial(numero);
        model.addAttribute("numero", numero);
        model.addAttribute("factorial", factorial);
        return "resultado";

    }

}


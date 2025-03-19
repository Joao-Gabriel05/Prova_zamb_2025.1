package br.inper.prova.teste;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class TesteController {
    @GetMapping("/teste")
    public String teste(){
        return " Hello World";
    }
}

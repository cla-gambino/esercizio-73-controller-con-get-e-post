package develhope.esercizio73controllercongetepost;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @GetMapping(path = "/nome")
    public String name(@RequestParam(value = "nome", required = true) String nome) {
        return nome;

    }

    @PostMapping(path = "/reverseNome")
    public String reverseName(@RequestParam(value = "nome", required = true) String nome) {
        return new StringBuilder(nome).reverse().toString();
    }

}
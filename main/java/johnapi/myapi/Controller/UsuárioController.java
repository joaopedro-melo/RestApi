package johnapi.myapi.Controller;

import johnapi.myapi.Model.UsuárioModel;
import johnapi.myapi.Repository.UsuárioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuárioController {

    private final UsuárioRepository repository;

    public UsuárioController(UsuárioRepository repository) {
        this.repository = repository;
    }


    @GetMapping(path = "/api/data/{código}")
    public ResponseEntity consultar(@PathVariable("código") Integer código) {

        return repository.findById(código)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/data/salvar")
    public UsuárioModel salvar(@RequestBody UsuárioModel data) {
        return repository.save(data);

    }
}

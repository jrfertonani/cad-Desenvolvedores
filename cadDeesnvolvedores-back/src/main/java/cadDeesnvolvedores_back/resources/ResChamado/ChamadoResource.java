package cadDeesnvolvedores_back.resources.ResChamado;

import cadDeesnvolvedores_back.domain.dtos.ChamadosDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ChamadoResource {

    @PostMapping
    ResponseEntity<ChamadosDTO> create(@RequestBody ChamadosDTO objDTO);

    @GetMapping
    ResponseEntity<List<ChamadosDTO>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<ChamadosDTO> findById(@PathVariable Integer id);

    @PutMapping("/{id}")
    ResponseEntity<ChamadosDTO> update(@PathVariable Integer id,
                                       @RequestBody ChamadosDTO objDTO);

    @DeleteMapping("/{id}")
    ResponseEntity<ChamadosDTO> delete(@PathVariable Integer id);



}

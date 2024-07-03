package cadDeesnvolvedores_back.resources.ResDesenvolvedor;

import cadDeesnvolvedores_back.domain.dtos.DesenvolvedoresDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface DesenvolvedorResorce {


    @PostMapping
    ResponseEntity<DesenvolvedoresDTO> create(@RequestBody DesenvolvedoresDTO objDTO);

    @GetMapping
    ResponseEntity<List<DesenvolvedoresDTO>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<DesenvolvedoresDTO> findById(@PathVariable Integer id);

    @PutMapping("/{id}")
    ResponseEntity<DesenvolvedoresDTO> update(@PathVariable Integer id,
                                              @RequestBody DesenvolvedoresDTO objDto);

    @DeleteMapping("/{id}")
    ResponseEntity<DesenvolvedoresDTO> delete(@PathVariable Integer id);


}

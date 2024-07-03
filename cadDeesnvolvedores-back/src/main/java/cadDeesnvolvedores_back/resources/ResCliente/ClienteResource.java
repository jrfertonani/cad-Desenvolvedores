package cadDeesnvolvedores_back.resources.ResCliente;

import cadDeesnvolvedores_back.domain.dtos.ClientesDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ClienteResource {

    @PostMapping
    ResponseEntity<ClientesDTO> create(@RequestBody ClientesDTO objDTO);

    @GetMapping
    ResponseEntity<List<ClientesDTO>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<ClientesDTO> findById(@PathVariable Integer id);

    @PutMapping("/{id}")
    ResponseEntity<ClientesDTO> update(@PathVariable Integer id,
                                       @RequestBody ClientesDTO objDto);

    @DeleteMapping("/{id}")
    ResponseEntity<ClientesDTO> delete(@PathVariable Integer id);

}

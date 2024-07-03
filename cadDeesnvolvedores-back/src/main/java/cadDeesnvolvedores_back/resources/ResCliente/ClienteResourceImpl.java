package cadDeesnvolvedores_back.resources.ResCliente;

import cadDeesnvolvedores_back.domain.Clientes;
import cadDeesnvolvedores_back.domain.dtos.ClientesDTO;
import cadDeesnvolvedores_back.services.SerCliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteResourceImpl implements ClienteResource{

    @Autowired
    private ClienteService service;


    @Override
    public ResponseEntity<ClientesDTO> create(ClientesDTO objDTO) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(service.create(objDTO))
                .toUri();
        return ResponseEntity.created(uri).body(objDTO);
    }

    @Override
    public ResponseEntity<List<ClientesDTO>> findAll() {
        List<Clientes> list = service.findAll();
        return ResponseEntity.ok().body(
                list.stream().map(
                        ClientesDTO::new)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public ResponseEntity<ClientesDTO> findById(Integer id) {
        Clientes obj = service.findById(id);
        return ResponseEntity.ok().body(new ClientesDTO(obj));
    }

    @Override
    public ResponseEntity<ClientesDTO> update(Integer id, ClientesDTO objDto) {
        objDto.setId(null);
        Clientes newObj = service.update(id,objDto);
        return ResponseEntity.ok().body(new ClientesDTO(newObj));
    }

    @Override
    public ResponseEntity<ClientesDTO> delete(Integer id) {
        service.delete(id);
        return ResponseEntity.notFound().build();
    }
}

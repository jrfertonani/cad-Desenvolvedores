package cadDeesnvolvedores_back.resources.ResDesenvolvedor;

import cadDeesnvolvedores_back.domain.Desenvolvedores;
import cadDeesnvolvedores_back.domain.dtos.DesenvolvedoresDTO;
import cadDeesnvolvedores_back.services.SerDesenvolvedor.DesenvolvedoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/desenvolvedores")
@CrossOrigin("*")
public final class DesenvolvedorResouceimpl implements DesenvolvedorResorce{

    @Autowired
    public DesenvolvedoreService service;

    @Override
    public ResponseEntity<DesenvolvedoresDTO> create(DesenvolvedoresDTO objDTO) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        service.create(objDTO))
                .toUri();
        return ResponseEntity.created(uri).body(objDTO);
    }

    @Override
    public ResponseEntity<List<DesenvolvedoresDTO>> findAll() {
        List<Desenvolvedores> list = service.findAll();
        return ResponseEntity.ok().body(
                list.stream().map(
                        DesenvolvedoresDTO::new
                ).collect(Collectors.toList())
        );
    }

    @Override
    public ResponseEntity<DesenvolvedoresDTO> findById(Integer id) {
        Desenvolvedores obj = service.findById(id);
        return ResponseEntity.ok().body(new DesenvolvedoresDTO(obj));
    }

    @Override
    public ResponseEntity<DesenvolvedoresDTO> update(Integer id, DesenvolvedoresDTO objDto) {
        Desenvolvedores obj = service.update(objDto,id);
        return ResponseEntity.ok().body(new DesenvolvedoresDTO(obj));
    }

    @Override
    public ResponseEntity<DesenvolvedoresDTO> delete(Integer id) {
        service.delete(id);
        return ResponseEntity.notFound().build();
    }
}

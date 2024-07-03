package cadDeesnvolvedores_back.resources.ResChamado;

import cadDeesnvolvedores_back.domain.Chamados;
import cadDeesnvolvedores_back.domain.dtos.ChamadosDTO;
import cadDeesnvolvedores_back.services.SerChamado.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/chamados")
public class ChamadoResourcempl implements ChamadoResource {

    @Autowired
    private ChamadoService service;


    @Override
    public ResponseEntity<ChamadosDTO> create(ChamadosDTO objDTO) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        service.create(objDTO)
                ).toUri();
        return ResponseEntity.created(uri).body(objDTO);
    }

    @Override
    public ResponseEntity<List<ChamadosDTO>> findAll() {
        List<Chamados> list = service.findAll();
        return ResponseEntity.ok().body(
                list.stream().map(
                ChamadosDTO::new
        ).collect(Collectors.toList())
        );
    }

    @Override
    public ResponseEntity<ChamadosDTO> findById(Integer id) {
        Chamados obj = service.findById(id);
        return ResponseEntity.ok().body(new ChamadosDTO(obj));
    }

    @Override
    public ResponseEntity<ChamadosDTO> update(Integer id, ChamadosDTO objDTO) {
        Chamados obj = service.update(id,objDTO);
        return ResponseEntity.ok().body(new ChamadosDTO(obj));
    }




    @Override
    public ResponseEntity<ChamadosDTO> delete(Integer id) {
        service.delete(id);
        return ResponseEntity.notFound().build();
    }


}

package cadDeesnvolvedores_back.services.SerChamado;

import cadDeesnvolvedores_back.domain.Chamados;
import cadDeesnvolvedores_back.domain.dtos.ChamadosDTO;

import java.util.List;

public interface ChamadoService {

    Chamados create(ChamadosDTO objDTO);

    List<Chamados> findAll();

    Chamados findById(Integer id);

    void delete(Integer id);

    Chamados update(Integer id, ChamadosDTO objDTO);
}

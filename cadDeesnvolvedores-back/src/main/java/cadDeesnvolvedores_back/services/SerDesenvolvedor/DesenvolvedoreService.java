package cadDeesnvolvedores_back.services.SerDesenvolvedor;


import cadDeesnvolvedores_back.domain.Desenvolvedores;
import cadDeesnvolvedores_back.domain.dtos.DesenvolvedoresDTO;

import java.util.List;
import java.util.Optional;


public interface DesenvolvedoreService {


    Desenvolvedores create(DesenvolvedoresDTO objDTO);
    List<Desenvolvedores> findAll();
    Desenvolvedores findById(Integer id);
    Desenvolvedores update(DesenvolvedoresDTO objDTO, Integer id);
    void delete(Integer id);

}

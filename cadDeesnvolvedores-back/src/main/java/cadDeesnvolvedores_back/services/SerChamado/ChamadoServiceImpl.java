package cadDeesnvolvedores_back.services.SerChamado;

import cadDeesnvolvedores_back.domain.Chamados;
import cadDeesnvolvedores_back.domain.dtos.ChamadosDTO;
import cadDeesnvolvedores_back.repositories.ChamadoRepository;
import cadDeesnvolvedores_back.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChamadoServiceImpl implements ChamadoService {

    @Autowired
    private ChamadoRepository repository;

    @Override
    public Chamados create(ChamadosDTO objDTO) {
        objDTO.setId(null);
        Chamados newObj = new Chamados(objDTO);
        return repository.save(newObj);
    }

    @Override
    public List<Chamados> findAll() {
        return repository.findAll();
    }

    @Override
    public Chamados findById(Integer id) {
        Optional<Chamados> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " +id));
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    @Override
    public Chamados update(Integer id, ChamadosDTO objDTO) {
        objDTO.setId(id);
        findById(id);
        Chamados obj = new Chamados(objDTO);
        return repository.save(obj);
    }


}

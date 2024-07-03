package cadDeesnvolvedores_back.services.SerDesenvolvedor;

import cadDeesnvolvedores_back.domain.Desenvolvedores;
import cadDeesnvolvedores_back.domain.dtos.DesenvolvedoresDTO;
import cadDeesnvolvedores_back.repositories.DesenvolvedorRepository;
import cadDeesnvolvedores_back.services.exceptions.ObjectNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesenvolvedorServiceImpl implements DesenvolvedoreService{

    @Autowired
    private DesenvolvedorRepository repository;


    @Override
    public Desenvolvedores create(DesenvolvedoresDTO objDTO) {
        objDTO.setId(null);
        Desenvolvedores newObj = new Desenvolvedores(objDTO);
        return repository.save(newObj);
    }

    @Override
    public List<Desenvolvedores> findAll() {
        return repository.findAll();
    }

    @Override
    public Desenvolvedores findById(Integer id) {
        Optional<Desenvolvedores> list = repository.findById(id);
        return list.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " +id));
    }

    @Override
    public Desenvolvedores update(DesenvolvedoresDTO objDTO, Integer id) {
        objDTO.setId(id);
        findById(id);
        Desenvolvedores newObj = new Desenvolvedores(objDTO);
        return repository.save(newObj);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }
}

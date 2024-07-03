package cadDeesnvolvedores_back.services.SerCliente;

import cadDeesnvolvedores_back.domain.Clientes;
import cadDeesnvolvedores_back.domain.dtos.ClientesDTO;
import cadDeesnvolvedores_back.repositories.ClienteRepository;
import cadDeesnvolvedores_back.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;

    @Override
    public Clientes create(ClientesDTO objDTO) {
        objDTO.setId(null);
        Clientes newObj = new Clientes(objDTO);
      return repository.save(newObj);
    }

    @Override
    public List<Clientes> findAll() {
        return repository.findAll();
    }

    @Override
    public Clientes findById(Integer id) {
        Optional<Clientes> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " +id));
    }

    @Override
    public Clientes update(Integer id, ClientesDTO objDto) {
        objDto.setId(id);
        findById(id);
        Clientes newObj = new Clientes(objDto);
        return repository.save(newObj);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }
}

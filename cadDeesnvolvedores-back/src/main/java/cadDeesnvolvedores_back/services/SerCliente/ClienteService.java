package cadDeesnvolvedores_back.services.SerCliente;

import cadDeesnvolvedores_back.domain.Clientes;
import cadDeesnvolvedores_back.domain.dtos.ClientesDTO;

import java.util.List;

public interface ClienteService {

    Clientes create(ClientesDTO objDTO);

    List<Clientes> findAll();

    Clientes findById(Integer id);

    Clientes update(Integer id, ClientesDTO objDto);

    void delete(Integer id);
}

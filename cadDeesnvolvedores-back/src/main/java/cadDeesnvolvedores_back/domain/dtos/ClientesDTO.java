package cadDeesnvolvedores_back.domain.dtos;

import cadDeesnvolvedores_back.domain.Clientes;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ClientesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer id;
    protected String nome;

    public ClientesDTO(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public ClientesDTO() {
    }

    public ClientesDTO(Clientes objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
    }


}

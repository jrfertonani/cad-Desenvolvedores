package cadDeesnvolvedores_back.domain;


import cadDeesnvolvedores_back.domain.dtos.ClientesDTO;
import jakarta.persistence.Entity;
import lombok.Setter;

@Setter
@Entity
public class Clientes  extends Pessoas {
    private static final long serialVersionUID = 1L;

    public Clientes() {
        super();
    }

    public Clientes(Integer id, String nome) {
        super(id, nome);
    }


    public Clientes(ClientesDTO objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
    }
}

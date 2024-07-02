package cadDeesnvolvedores_back.domain;

import cadDeesnvolvedores_back.domain.dtos.DesenvolvedoresDTO;
import jakarta.persistence.Entity;

@Entity
public class Desenvolvedores extends Pessoas {
    private static final long serialVersionUID = 1L;


    public Desenvolvedores(){
        super();
    }

    public Desenvolvedores(Integer id, String nome) {
        super(id, nome);
    }

    public Desenvolvedores(DesenvolvedoresDTO objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
    }
}

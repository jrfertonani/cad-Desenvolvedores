package cadDeesnvolvedores_back.domain.dtos;

import cadDeesnvolvedores_back.domain.Desenvolvedores;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class DesenvolvedoresDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer id;
    protected String nome;

    public DesenvolvedoresDTO(DesenvolvedoresDTO objDTO) {
        super();
    }

    public DesenvolvedoresDTO(Desenvolvedores objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
    }

    public DesenvolvedoresDTO(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}

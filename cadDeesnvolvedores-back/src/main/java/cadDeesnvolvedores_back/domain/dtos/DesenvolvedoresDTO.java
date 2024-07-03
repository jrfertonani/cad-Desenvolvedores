package cadDeesnvolvedores_back.domain.dtos;

import cadDeesnvolvedores_back.domain.Desenvolvedores;
import cadDeesnvolvedores_back.domain.enums.EnumNiveisDesenvolvedores;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class DesenvolvedoresDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer id;
    protected String nome;
    @Enumerated(value = EnumType.STRING)
    protected EnumNiveisDesenvolvedores niveis;

    public DesenvolvedoresDTO(DesenvolvedoresDTO objDTO) {
        super();
    }

    public DesenvolvedoresDTO(Integer id, String nome, EnumNiveisDesenvolvedores niveis) {
        this.id = id;
        this.nome = nome;
        this.niveis = niveis;
    }
    public DesenvolvedoresDTO(Desenvolvedores objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
        this.niveis = objDTO.getNiveis();
    }


}

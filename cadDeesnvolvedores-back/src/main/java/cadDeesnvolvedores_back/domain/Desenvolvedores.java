package cadDeesnvolvedores_back.domain;

import cadDeesnvolvedores_back.domain.dtos.DesenvolvedoresDTO;
import cadDeesnvolvedores_back.domain.enums.EnumNiveisDesenvolvedores;
import cadDeesnvolvedores_back.domain.enums.EnumStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Desenvolvedores extends Pessoas {
    private static final long serialVersionUID = 1L;

    @Enumerated(value = EnumType.STRING)
    private EnumNiveisDesenvolvedores niveis;

    public Desenvolvedores(){
        super();
    }

    public Desenvolvedores(Integer id, String nome, EnumNiveisDesenvolvedores niveis) {
        super(id, nome);
        this.niveis = niveis;
    }


    public Desenvolvedores(DesenvolvedoresDTO objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
        this.niveis = objDTO.getNiveis();
    }
}

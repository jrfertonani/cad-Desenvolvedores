package cadDeesnvolvedores_back.domain.dtos;


import cadDeesnvolvedores_back.domain.Desenvolvedor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
public class DesenvolvedorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer id;
    protected String nome;

    public DesenvolvedorDTO() {
        super();
    }

    public DesenvolvedorDTO(Desenvolvedor obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }



}

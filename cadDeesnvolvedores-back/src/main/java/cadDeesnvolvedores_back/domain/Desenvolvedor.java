package cadDeesnvolvedores_back.domain;

import cadDeesnvolvedores_back.domain.dtos.DesenvolvedorDTO;
import jakarta.persistence.Entity;

@Entity
public class Desenvolvedor extends Pessoa{
    private static final long serialVersionUID = 1L;


    public Desenvolvedor(){
        super();
    }

    public Desenvolvedor(Integer id, String nome) {
        super(id, nome);
    }

    public Desenvolvedor(DesenvolvedorDTO obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }
}

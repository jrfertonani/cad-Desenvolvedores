package cadDeesnvolvedores_back.domain.dtos;

import cadDeesnvolvedores_back.domain.Chamados;
import cadDeesnvolvedores_back.domain.enums.EnumStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ChamadosDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Integer id;
    protected String nome;
    protected String descricao;
    protected Integer quantidade;
    @Enumerated(value = EnumType.STRING)
    protected EnumStatus status;

    public ChamadosDTO() {
    }

    public ChamadosDTO(Integer id, String nome, String descricao, Integer quantidade, EnumStatus status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.status = status;
    }




    public ChamadosDTO(Chamados objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
        this.descricao = objDTO.getDescricao();
        this.quantidade = objDTO.getQuantidade();
        this.status = objDTO.getStatus();
    }



}

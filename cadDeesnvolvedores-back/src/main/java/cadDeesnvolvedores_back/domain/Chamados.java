package cadDeesnvolvedores_back.domain;

import cadDeesnvolvedores_back.domain.dtos.ChamadosDTO;
import cadDeesnvolvedores_back.domain.enums.EnumStatus;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
public class Chamados implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private Integer quantidade;
    @Enumerated(value = EnumType.STRING)
    private EnumStatus status;

    public Chamados(ChamadosDTO objDTO) {
        this.id = objDTO.getId();
        this.nome = objDTO.getNome();
        this.descricao = objDTO.getDescricao();
        this.quantidade = objDTO.getQuantidade();
        this.status = objDTO.getStatus();
    }

}

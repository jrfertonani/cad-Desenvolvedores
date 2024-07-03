package cadDeesnvolvedores_back.repositories;

import cadDeesnvolvedores_back.domain.Chamados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamados, Integer> {
}

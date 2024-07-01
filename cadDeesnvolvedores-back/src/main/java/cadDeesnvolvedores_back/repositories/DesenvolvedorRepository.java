package cadDeesnvolvedores_back.repositories;

import cadDeesnvolvedores_back.domain.Desenvolvedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesenvolvedorRepository extends JpaRepository<Desenvolvedor, Integer> {
}

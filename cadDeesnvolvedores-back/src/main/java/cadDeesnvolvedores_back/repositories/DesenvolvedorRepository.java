package cadDeesnvolvedores_back.repositories;

import cadDeesnvolvedores_back.domain.Desenvolvedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesenvolvedorRepository extends JpaRepository<Desenvolvedores, Integer> {
}

package cadDeesnvolvedores_back.repositories;

import cadDeesnvolvedores_back.domain.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoas, Integer> {
}

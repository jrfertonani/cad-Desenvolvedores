package cadDeesnvolvedores_back.repositories;

import cadDeesnvolvedores_back.domain.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Integer> {
}

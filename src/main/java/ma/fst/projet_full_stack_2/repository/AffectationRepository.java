package ma.fst.projet_full_stack_2.repository;

import ma.fst.projet_full_stack_2.entities.Affectation;
import ma.fst.projet_full_stack_2.entities.AffectationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffectationRepository extends JpaRepository<Affectation, AffectationId> {
}
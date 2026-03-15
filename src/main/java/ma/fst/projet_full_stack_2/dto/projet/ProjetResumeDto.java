package ma.fst.projet_full_stack_2.dto.projet;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ProjetResumeDto {
    private Long id;
    private String code;
    private String nom;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Double montant;
    private String organismeNom;
    private String chefProjetNomComplet;
}
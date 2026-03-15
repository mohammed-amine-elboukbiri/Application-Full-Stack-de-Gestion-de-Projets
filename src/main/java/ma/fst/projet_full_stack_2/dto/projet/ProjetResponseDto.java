package ma.fst.projet_full_stack_2.dto.projet;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ProjetResponseDto {

    private Long id;
    private String code;
    private String nom;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Double montant;

    private Long organismeId;
    private String organismeNom;

    private Long chefProjetId;
    private String chefProjetNomComplet;
}
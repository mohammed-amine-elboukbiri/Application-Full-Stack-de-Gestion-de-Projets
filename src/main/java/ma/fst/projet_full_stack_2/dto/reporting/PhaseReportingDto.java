package ma.fst.projet_full_stack_2.dto.reporting;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PhaseReportingDto {
    private Long id;
    private String code;
    private String libelle;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Double montant;
    private Boolean etatRealisation;
    private Boolean etatFacturation;
    private Boolean etatPaiement;
    private Long projetId;
    private String projetNom;
}
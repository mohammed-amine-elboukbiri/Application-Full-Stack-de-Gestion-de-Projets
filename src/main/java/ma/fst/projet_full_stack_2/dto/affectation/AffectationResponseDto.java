package ma.fst.projet_full_stack_2.dto.affectation;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class AffectationResponseDto {

    private Long employeId;
    private String employeNomComplet;

    private Long phaseId;
    private String phaseLibelle;

    private LocalDate dateDebut;
    private LocalDate dateFin;
}
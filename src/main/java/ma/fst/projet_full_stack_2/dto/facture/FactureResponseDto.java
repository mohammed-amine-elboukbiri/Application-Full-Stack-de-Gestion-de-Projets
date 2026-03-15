package ma.fst.projet_full_stack_2.dto.facture;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FactureResponseDto {

    private Long id;
    private String code;
    private LocalDate dateFacture;

    private Long phaseId;
    private String phaseLibelle;
    private Boolean etatRealisation;
    private Boolean etatFacturation;
    private Boolean etatPaiement;
}
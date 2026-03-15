package ma.fst.projet_full_stack_2.dto.phase;

import lombok.Data;

@Data
public class PhaseEtatDto {
    private Boolean etatRealisation;
    private Boolean etatFacturation;
    private Boolean etatPaiement;
}
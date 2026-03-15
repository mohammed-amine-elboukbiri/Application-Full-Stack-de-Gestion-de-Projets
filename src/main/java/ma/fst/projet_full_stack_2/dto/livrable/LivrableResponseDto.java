package ma.fst.projet_full_stack_2.dto.livrable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LivrableResponseDto {

    private Long id;
    private String code;
    private String libelle;
    private String description;
    private String chemin;

    private Long phaseId;
    private String phaseLibelle;
}
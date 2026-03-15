package ma.fst.projet_full_stack_2.dto.document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DocumentResponseDto {

    private Long id;
    private String code;
    private String libelle;
    private String description;
    private String chemin;

    private Long projetId;
    private String projetNom;
}
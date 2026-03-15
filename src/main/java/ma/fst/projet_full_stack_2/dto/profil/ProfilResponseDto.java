package ma.fst.projet_full_stack_2.dto.profil;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfilResponseDto {
    private Long id;
    private String code;
    private String libelle;
}
package ma.fst.projet_full_stack_2.dto.profil;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProfilRequestDto {

    @NotBlank(message = "Le code est nécessaire")
    private String code;

    @NotBlank(message = "Le libellé est nécessaire")
    private String libelle;
}
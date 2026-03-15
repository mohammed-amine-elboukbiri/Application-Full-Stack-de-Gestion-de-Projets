package ma.fst.projet_full_stack_2.dto.livrable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LivrableRequestDto {

    @NotBlank(message = "Le code est nécessaire")
    private String code;

    @NotBlank(message = "Le libellé est nécessaire")
    private String libelle;

    private String description;

    @NotBlank(message = "Le chemin du fichier est nécessaire")
    private String chemin;

    @NotNull(message = "La phase est nécessaire")
    private Long phaseId;
}
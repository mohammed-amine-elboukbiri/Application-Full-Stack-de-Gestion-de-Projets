package ma.fst.projet_full_stack_2.dto.document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DocumentRequestDto {

    @NotBlank(message = "Le code est nécessaire")
    private String code;

    @NotBlank(message = "Le libellé est nécessaire")
    private String libelle;

    private String description;

    @NotBlank(message = "Le chemin du fichier est nécessaire")
    private String chemin;

    @NotNull(message = "Le projet est nécessaire")
    private Long projetId;
}
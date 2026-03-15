package ma.fst.projet_full_stack_2.dto.facture;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FactureRequestDto {

    @NotBlank(message = "Le code est nécessaire")
    private String code;

    @NotNull(message = "La date de facture est nécessaire")
    private LocalDate dateFacture;

    @NotNull(message = "La phase est nécessaire")
    private Long phaseId;
}
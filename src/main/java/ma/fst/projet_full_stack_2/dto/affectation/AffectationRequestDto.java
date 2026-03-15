package ma.fst.projet_full_stack_2.dto.affectation;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AffectationRequestDto {

    @NotNull(message = "L'employé est nécessaire")
    private Long employeId;

    @NotNull(message = "La phase est nécessaire")
    private Long phaseId;

    @NotNull(message = "La date de début est nécessaire")
    private LocalDate dateDebut;

    @NotNull(message = "La date de fin est nécessaire")
    private LocalDate dateFin;
}
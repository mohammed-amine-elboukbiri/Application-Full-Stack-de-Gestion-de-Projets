package ma.fst.projet_full_stack_2.dto.phase;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PhaseCreateDto {

    @NotBlank(message = "Le code est nécessaire")
    private String code;

    @NotBlank(message = "Le libellé est nécessaire")
    private String libelle;

    private String description;

    @NotNull(message = "La date de début est nécessaire")
    private LocalDate dateDebut;

    @NotNull(message = "La date de fin est nécessaire")
    private LocalDate dateFin;

    @NotNull(message = "Le montant est nécessaire")
    private Double montant;

    @NotNull(message = "Le projet est nécessaire")
    private Long projetId;
}
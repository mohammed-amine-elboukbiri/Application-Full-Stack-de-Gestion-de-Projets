package ma.fst.projet_full_stack_2.dto.projet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ProjetCreateDto {

    @NotBlank(message = "Le code est nécessaire")
    private String code;

    @NotBlank(message = "Le nom est nécessaire")
    private String nom;

    private String description;

    @NotNull(message = "La date de début est nécessaire")
    private LocalDate dateDebut;

    @NotNull(message = "La date de fin est nécessaire")
    private LocalDate dateFin;

    @NotNull(message = "Le montant est nécessaire")
    private Double montant;

    @NotNull(message = "L'organisme est nécessaire")
    private Long organismeId;

    @NotNull(message = "Le chef de projet est nécessaire")
    private Long chefProjetId;
}
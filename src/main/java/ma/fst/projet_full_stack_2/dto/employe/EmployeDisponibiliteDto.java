package ma.fst.projet_full_stack_2.dto.employe;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class EmployeDisponibiliteDto {
    private Long employeId;
    private String employeNomComplet;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Boolean disponible;
    private String message;
}
package ma.fst.projet_full_stack_2.dto.employe;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeResponseDto {
    private Long id;
    private String matricule;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String login;
    private Long profilId;
    private String profilCode;
    private String profilLibelle;
}
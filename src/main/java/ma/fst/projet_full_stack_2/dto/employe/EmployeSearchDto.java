package ma.fst.projet_full_stack_2.dto.employe;

import lombok.Data;

@Data
public class EmployeSearchDto {
    private String matricule;
    private String nom;
    private String prenom;
    private String email;
    private String login;
    private Long profilId;
}
package ma.fst.projet_full_stack_2.dto.employe;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EmployeRequestDto {

    @NotBlank(message = "Le matricule est nécessaire")
    private String matricule;

    @NotBlank(message = "Le nom est nécessaire")
    private String nom;

    @NotBlank(message = "Le prénom est nécessaire")
    private String prenom;

    private String telephone;

    @NotBlank(message = "L'email est nécessaire")
    @Email(message = "Format d'email invalide")
    private String email;

    @NotBlank(message = "Le login est nécessaire")
    private String login;

    @NotBlank(message = "Le mot de passe est nécessaire")
    private String password;

    @NotNull(message = "Le profil est nécessaire")
    private Long profilId;
}
package ma.fst.projet_full_stack_2.dto.organisme;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OrganismeRequestDto {

    @NotBlank(message = "Le code est nécessaire")
    private String code;

    @NotBlank(message = "Le nom est nécessaire")
    private String nom;

    private String adresse;

    private String telephone;

    private String nomContact;

    @Email(message = "Format d'email invalide")
    private String emailContact;

    private String siteWeb;
}
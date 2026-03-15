package ma.fst.projet_full_stack_2.dto.organisme;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrganismeResponseDto {
    private Long id;
    private String code;
    private String nom;
    private String adresse;
    private String telephone;
    private String nomContact;
    private String emailContact;
    private String siteWeb;
}
package ma.fst.projet_full_stack_2.dto.organisme;

import lombok.Data;

@Data
public class OrganismeSearchDto {
    private String code;
    private String nom;
    private String nomContact;
    private String emailContact;
}
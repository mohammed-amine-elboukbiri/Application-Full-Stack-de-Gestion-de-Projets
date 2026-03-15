package ma.fst.projet_full_stack_2.dto.projet;

import lombok.Data;

@Data
public class ProjetSearchDto {
    private String code;
    private String nom;
    private Long organismeId;
    private Long chefProjetId;
}
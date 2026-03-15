package ma.fst.projet_full_stack_2.dto.auth;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponseDto {
    private String token;
    private String type;
    private Long employeId;
    private String login;
    private String profil;
}
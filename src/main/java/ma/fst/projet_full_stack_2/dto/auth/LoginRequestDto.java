package ma.fst.projet_full_stack_2.dto.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequestDto {

    @NotBlank(message = "Le login est nécessaire")
    private String login;

    @NotBlank(message = "Le mot de passe est nécessaire")
    private String password;
}
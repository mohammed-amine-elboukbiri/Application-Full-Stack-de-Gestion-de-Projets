package ma.fst.projet_full_stack_2.controller;

import ma.fst.projet_full_stack_2.dto.auth.AuthResponseDto;
import ma.fst.projet_full_stack_2.dto.auth.LoginRequestDto;
import ma.fst.projet_full_stack_2.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public AuthResponseDto login(@Valid @RequestBody LoginRequestDto dto) {
        return authService.login(dto);
    }
}
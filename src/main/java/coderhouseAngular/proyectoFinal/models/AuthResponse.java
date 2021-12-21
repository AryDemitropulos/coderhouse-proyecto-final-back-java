package coderhouseAngular.proyectoFinal.models;

import coderhouseAngular.proyectoFinal.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String name;
    private String lastname;
    private String mail;
    private Role role;
}

package andrianopasquale97.U5W2D22.entities;

import lombok.*;

import java.time.LocalDate;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Autore {
    int id;
    String nome;
    String cognome;
    String email;
    LocalDate dataNascita;
    String avatar;

    }

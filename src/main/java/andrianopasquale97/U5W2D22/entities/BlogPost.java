package andrianopasquale97.U5W2D22.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class BlogPost {
    int id ;
    String categoria;
    String titolo;
    String cover;
    String contenuto;
    int tempoDiLettura;


}

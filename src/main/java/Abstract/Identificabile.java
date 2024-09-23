package Abstract;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Identificabile {

    @Id
    private static long idIncrementazione= 0;
    public abstract String getID ();

    public static String getIdIncrementazione() {
        return String.valueOf(idIncrementazione++);
    }

}

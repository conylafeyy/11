import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Film {
    private int id;
    private int filmId;
    private String filmName;
    private String filmGenre;
}

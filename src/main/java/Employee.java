import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
// annotation help to automatically write the code

public class Employee {
    private String name;
    private String email;
}

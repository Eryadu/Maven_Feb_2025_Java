import lombok.*;

/*@Getter
@Setter
@AllArgsConstructor
@ToString*/
@Data // Top Class Annotation (Contain getter setter)
@AllArgsConstructor
// @RequiredArgsConstructor
// annotation help to automatically write the code

public class Employee {
    private final String name;
    private String email;
}

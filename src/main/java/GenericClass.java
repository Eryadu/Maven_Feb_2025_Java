import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class GenericClass <T>{
    private T name;
    private T email;

    public static void main(String[] args) {
        GenericClass <String> generic =  new GenericClass<>("ABC", "abc@gmail.com");
        System.out.println(generic);
        System.out.println(generic.getName());
        System.out.println(generic.getEmail());
    }
}


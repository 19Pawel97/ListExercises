package exercise5;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    private String indexId;
    private String name;
    private String surname;
    private Sex sex;
}

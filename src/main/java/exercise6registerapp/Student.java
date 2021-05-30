package Exercise6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Student {
    private List<Double> marks;
    private String indexNum;
    private String name;
    private String surname;
}

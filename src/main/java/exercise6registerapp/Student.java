package exercise6registerapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
    private List<Double> marks;
    private String indexNum;
    private String name;
    private String surname;
}

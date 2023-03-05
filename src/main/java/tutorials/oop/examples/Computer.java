package tutorials.oop.examples;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract public class Computer {
    private String mainBoard;
    private String cpu;
    private String ram;

   abstract public void fullInformation(int year);
}

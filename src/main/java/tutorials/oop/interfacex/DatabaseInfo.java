package tutorials.oop.interfacex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
 abstract public class DatabaseInfo {

    private String url;
    private String username;
    private String password;
}

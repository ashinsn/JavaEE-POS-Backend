package lk.ijse.javaeeposbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropertyDTO {
    private String proId;
    private String supId;
    private String type;
    private String address;
    private String price;
    private String perches;
    private String status;
}

package lk.ijse.javaeeposbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SupplierDTO {
    private String supId;
    private String admId;
    private String name;
    private String address;
    private String mobile;
    private String email;
}

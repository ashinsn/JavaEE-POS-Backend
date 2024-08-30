package lk.ijse.javaeeposbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppointmentDTO {
    private String appId;
    private String admId;
    private String cusName;
    private String cusMobile;
    private String dateTime;
    private String status;
}

package lk.ijse.javaeeposbackend.bo.custom;

import lk.ijse.javaeeposbackend.dto.AppointmentDTO;

import java.util.List;

public interface AppointmentBO {
    List<AppointmentDTO> getAllAppointments();
    String saveAppointment(AppointmentDTO appointment);
    boolean updateAppointment(String appId, AppointmentDTO appointment);
    AppointmentDTO searchAppointment(String appId);
    boolean deleteAppointment(String appId);
    List<String> getAdminIds();
}


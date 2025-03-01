package lk.ijse.javaeeposbackend.bo.custom.impl;

import lk.ijse.javaeeposbackend.bo.custom.AppointmentBO;
import lk.ijse.javaeeposbackend.dao.custom.AppointmentDAO;
import lk.ijse.javaeeposbackend.dao.DAOFactory;
import lk.ijse.javaeeposbackend.dto.AppointmentDTO;

import java.util.List;

public class AppointmentBOIMPL implements AppointmentBO {
    private final AppointmentDAO appointmentDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.APPOINTMENT);

    @Override
    public List<AppointmentDTO> getAllAppointments() {
        return appointmentDAO.getAllAppointments();
    }

    @Override
    public String saveAppointment(AppointmentDTO appointment) {
        return appointmentDAO.saveAppointment(appointment);
    }

    @Override
    public boolean updateAppointment(String appId, AppointmentDTO appointment) {
        return appointmentDAO.updateAppointment(appId, appointment);
    }

    @Override
    public AppointmentDTO searchAppointment(String appId) {
        return appointmentDAO.searchAppointment(appId);
    }

    @Override
    public boolean deleteAppointment(String appId ) {
        return appointmentDAO.deleteAppointment(appId);
    }

    @Override
    public List<String> getAdminIds() {
        return appointmentDAO.getAdminIds();
    }
}

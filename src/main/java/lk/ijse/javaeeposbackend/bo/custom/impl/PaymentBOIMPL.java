package lk.ijse.javaeeposbackend.bo.custom.impl;

import lk.ijse.javaeeposbackend.bo.custom.PaymentBO;
import lk.ijse.javaeeposbackend.dao.DAOFactory;
import lk.ijse.javaeeposbackend.dao.custom.PaymentDAO;
import lk.ijse.javaeeposbackend.dto.CustomerDTO;
import lk.ijse.javaeeposbackend.dto.PaymentDTO;
import lk.ijse.javaeeposbackend.dto.PropertyDTO;

import java.util.List;

public class PaymentBOIMPL implements PaymentBO {
    private final PaymentDAO paymentDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.PAYMENT);

    @Override
    public String savePayment(PaymentDTO payment) {
        return paymentDAO.savePayment(payment);
    }

    @Override
    public String generatePaymentID() {
        return paymentDAO.generatePaymentID();
    }

    @Override
    public List<PropertyDTO> getAllProperties() {
        return paymentDAO.getAllProperties();
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return paymentDAO.getAllCustomers();
    }

    @Override
    public boolean updatePropertyStatus(String proId) {
        return paymentDAO.updatePropertyStatus(proId);
    }

    @Override
    public boolean updateAppointmentStatus(String cusId) {
        return paymentDAO.updateAppointmentStatus(cusId);
    }
}

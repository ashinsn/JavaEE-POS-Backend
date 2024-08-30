package lk.ijse.javaeeposbackend.bo.custom;

import lk.ijse.javaeeposbackend.dto.CustomerDTO;
import lk.ijse.javaeeposbackend.dto.PaymentDTO;
import lk.ijse.javaeeposbackend.dto.PropertyDTO;

import java.util.List;

public interface PaymentBO {
    String savePayment(PaymentDTO payment);
    String generatePaymentID();
    List<PropertyDTO> getAllProperties();
    List<CustomerDTO> getAllCustomers();
    boolean updatePropertyStatus(String proId);
    boolean updateAppointmentStatus(String cusId);
}


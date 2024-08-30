package lk.ijse.javaeeposbackend.bo.custom;

import lk.ijse.javaeeposbackend.dto.CustomerDTO;

import java.util.List;

public interface CustomerBO {
    List<CustomerDTO> getAllCustomers();
    String saveCustomer(CustomerDTO customer);
    boolean updateCustomer(String cusId, CustomerDTO customer);
    CustomerDTO searchCustomer(String cusId);
    boolean deleteCustomer(String cusId);
    List<String> getAppointmentIds();
}


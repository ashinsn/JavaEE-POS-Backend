package lk.ijse.javaeeposbackend.bo.custom;

import lk.ijse.javaeeposbackend.dto.SupplierDTO;

import java.util.List;

public interface SupplierBO {
    List<SupplierDTO> getAllSuppliers();
    String saveSupplier(SupplierDTO supplier);
    boolean updateSupplier(String supplierId, SupplierDTO supplier);
    SupplierDTO searchSupplier(String supplierId);
    boolean deleteSupplier(String supplierId);
    List<String> getAdminIds();
}


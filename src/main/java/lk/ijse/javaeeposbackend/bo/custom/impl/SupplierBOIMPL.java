package lk.ijse.javaeeposbackend.bo.custom.impl;

import lk.ijse.javaeeposbackend.bo.custom.SupplierBO;
import lk.ijse.javaeeposbackend.dao.DAOFactory;
import lk.ijse.javaeeposbackend.dao.custom.SupplierDAO;
import lk.ijse.javaeeposbackend.dto.SupplierDTO;

import java.util.List;

public class SupplierBOIMPL implements SupplierBO {
    private final SupplierDAO supplierDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.SUPPLIER);

    @Override
    public List<SupplierDTO> getAllSuppliers() {
        return supplierDAO.getAllSuppliers();
    }

    @Override
    public String saveSupplier(SupplierDTO supplier) {
        return supplierDAO.saveSupplier(supplier);
    }

    @Override
    public boolean updateSupplier(String supplierId, SupplierDTO supplier) {
        return supplierDAO.updateSupplier(supplierId, supplier);
    }

    @Override
    public SupplierDTO searchSupplier(String supplierId) {
        return supplierDAO.searchSupplier(supplierId);
    }

    @Override
    public boolean deleteSupplier(String supplierId ) {
        return supplierDAO.deleteSupplier(supplierId);
    }

    @Override
    public List<String> getAdminIds() {
        return supplierDAO.getAdminIds();
    }
}


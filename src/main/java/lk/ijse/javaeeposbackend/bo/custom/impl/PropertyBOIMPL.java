package lk.ijse.javaeeposbackend.bo.custom.impl;

import lk.ijse.javaeeposbackend.bo.custom.PropertyBO;
import lk.ijse.javaeeposbackend.dao.DAOFactory;
import lk.ijse.javaeeposbackend.dao.custom.PropertyDAO;
import lk.ijse.javaeeposbackend.dto.PropertyDTO;

import java.util.List;

public class PropertyBOIMPL implements PropertyBO {
    private final PropertyDAO propertyDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.PROPERTY);

    @Override
    public List<PropertyDTO> getAllProperties() {
        return propertyDAO.getAllProperties();
    }

    @Override
    public String saveProperty(PropertyDTO property) {
        return propertyDAO.saveProperty(property);
    }

    @Override
    public boolean updateProperty(String propertyId, PropertyDTO property) {
        return propertyDAO.updateProperty(propertyId, property);
    }

    @Override
    public PropertyDTO searchProperty(String propertyId) {
        return propertyDAO.searchProperty(propertyId);
    }

    @Override
    public boolean deleteProperty(String propertyId) {
        return propertyDAO.deleteProperty(propertyId);
    }

    @Override
    public List<String> getSupplierIds() {
        return propertyDAO.getSupplierIds();
    }
}


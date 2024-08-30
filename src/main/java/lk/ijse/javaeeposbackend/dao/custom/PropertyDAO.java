package lk.ijse.javaeeposbackend.dao.custom;

import lk.ijse.javaeeposbackend.dto.PropertyDTO;

import java.util.List;

public interface PropertyDAO {
    List<PropertyDTO> getAllProperties();
    String saveProperty(PropertyDTO property);
    boolean updateProperty(String propertyId, PropertyDTO property);
    PropertyDTO searchProperty(String propertyId);
    boolean deleteProperty(String propertyId);
    List<String> getSupplierIds();
}

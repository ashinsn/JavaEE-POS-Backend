package lk.ijse.javaeeposbackend.bo.custom.impl;

import lk.ijse.javaeeposbackend.bo.custom.AdminBO;
import lk.ijse.javaeeposbackend.dao.custom.AdminDAO;

import lk.ijse.javaeeposbackend.dao.DAOFactory;
import lk.ijse.javaeeposbackend.dto.AdminDTO;

public class AdminBOIMPL implements AdminBO {
    private final AdminDAO adminDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOType.ADMIN);

    @Override
    public String saveAdmin(AdminDTO admin) {
        return adminDAO.saveAdmin(admin);
    }
}

package lk.ijse.javaeeposbackend.bo;

import lk.ijse.javaeeposbackend.bo.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {
    }

    public static BOFactory getInstance() {
        return (boFactory == null) ? (boFactory = new BOFactory()) : (boFactory);
    }

    public enum BOTypes {
        PROPERTY, APPOINTMENT, CUSTOMER, ADMIN, PAYMENT, SUPPLIER
    }

    public <T> T getBO(BOTypes boType) {
        switch (boType) {
            case PROPERTY:
                return (T) new PropertyBOIMPL();
            case APPOINTMENT:
                return (T) new AppointmentBOIMPL();
            case CUSTOMER:
                return (T) new CustomerBOIMPL();
            case ADMIN:
                return (T) new AdminBOIMPL();
            case SUPPLIER:
                return (T) new SupplierBOIMPL();
            case PAYMENT:
                return (T) new PaymentBOIMPL();
            default:
                return null;
        }
    }
}


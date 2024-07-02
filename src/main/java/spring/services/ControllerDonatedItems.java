package spring.services;

import spring.dao.DonatedItemsDAO;
import spring.domain.donatedItems.DonatedItems;
import spring.utils.Jpa;

public class ControllerDonatedItems {
    private static final DonatedItemsDAO DAO = new DonatedItemsDAO(Jpa.getEntityManager());

    public static void registerCategory(DonatedItems item) {
        DAO.insert(item);
    }
}

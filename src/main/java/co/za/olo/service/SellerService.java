package co.za.olo.service;

import co.za.olo.DAO.SellerDAO;
import co.za.olo.entities.SellerEntity;

import java.util.List;

public class SellerService {
    SellerDAO sellerDAO = new SellerDAO();

    public SellerEntity loginSeller(SellerEntity sellerEntity){
        sellerDAO.getSellerByPassEmail(sellerEntity);
        return sellerEntity;
    }

    public void createSeller(SellerEntity sellerEntity){
        sellerDAO.createSeller(sellerEntity);
    }

    public SellerEntity locateStall(SellerEntity sellerEntity){
        return sellerDAO.getStall(sellerEntity);

    }

    public void reviewStall(SellerEntity sellerEntity){
        sellerDAO.createReview(sellerEntity);
    }

    public void editReview(SellerEntity sellerEntity){
        sellerDAO.updateReview(sellerEntity);
    }

    public void deleteSeller(SellerEntity sellerEntity){
        sellerDAO.deleteStall(sellerEntity);
    }
}

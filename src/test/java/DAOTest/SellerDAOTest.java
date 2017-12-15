package DAOTest;

import co.za.olo.DAO.SellerDAO;
import co.za.olo.entities.CustomerEntity;
import co.za.olo.entities.SellerEntity;
import org.junit.Assert;
import org.junit.Test;

public class SellerDAOTest {
    @Test
    public void createSellerTest(){
        SellerDAO sellerDAO = new SellerDAO();
        SellerEntity sellerEntity = new SellerEntity();

        sellerEntity.setAdvertPicture("eee");
        sellerEntity.setPicture("www");
        sellerEntity.setLocation("qqq");
        sellerEntity.setEmailAddress("sss@hhh.com");
        sellerEntity.setPassword("rrr");
        sellerEntity.setStallName("ooo");
        sellerEntity.setSellerName("vvv");
        sellerEntity.setStallId("sss");

        SellerEntity d = sellerDAO.createSeller(sellerEntity);

        Assert.assertEquals(sellerEntity.getAdvertPicture(),d.getAdvertPicture());
        Assert.assertEquals(sellerEntity.getPicture(),d.getPicture());

    }

    @Test
    public void getSellerByPassEmailTest(){
        SellerDAO sellerDAO = new SellerDAO();
        SellerEntity sellerEntity = new SellerEntity();

        sellerEntity.setEmailAddress("sss@hhh.com");
        sellerEntity.setPassword("rrr");

        SellerEntity f = sellerDAO.getSellerByPassEmail(sellerEntity);

        Assert.assertEquals("sss@hhh.com",f.getEmailAddress());
        Assert.assertEquals("rrr",f.getPassword());
    }

    @Test
    public void getSellerByIdTest(){
        SellerDAO sellerDAO = new SellerDAO();
        SellerEntity sellerEntity = new SellerEntity();

        SellerEntity v = sellerDAO.getSellerById("sss");
        Assert.assertEquals("sss", v.getStallId());
    }

    @Test
    public void getStallTest(){
        SellerDAO sellerDAO = new SellerDAO();
        SellerEntity sellerEntity = new SellerEntity();

        sellerEntity.setLocation("qqq");

        SellerEntity e = sellerDAO.getStall(sellerEntity);
        Assert.assertEquals("qqq",e.getLocation());
    }

    @Test
    public void createReviewTest(){
        SellerDAO sellerDAO = new SellerDAO();
        SellerEntity sellerEntity = new SellerEntity();

        //// tbc
    }

}

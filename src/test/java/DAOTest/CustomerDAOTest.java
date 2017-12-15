package DAOTest;

import co.za.olo.DAO.CustomerDAO;
import co.za.olo.entities.CustomerEntity;
import org.junit.Assert;
import org.junit.Test;

public class CustomerDAOTest {
    @Test
    public void createCustomerTest(){
        CustomerDAO customerDAO = new CustomerDAO();
        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setEmailAddress("sfsf@hfj.com");
        customerEntity.setPassword("rererr");
        customerEntity.setLocation("hfhfhf");
        customerEntity.setUserName("ffhfnf");
        customerEntity.setUserId("765758");

        /*********************** test  *****************************/
        CustomerEntity s = customerDAO.createCustomer(customerEntity);
        //////////////////////////////////////////////////////////////


        /************************ check *****************************/
        Assert.assertEquals(customerEntity.getEmailAddress(), s.getEmailAddress());
        Assert.assertEquals(customerEntity.getPassword(), s.getPassword());
        Assert.assertEquals(customerEntity.getLocation(), s.getLocation());

    }

    @Test
    public void getCustomerByPassEmailTest(){
        CustomerDAO customerDAO = new CustomerDAO();
        //TEST

        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setEmailAddress("sfsf@hfj.com");
        customerEntity.setPassword("rererr");


        CustomerEntity c = customerDAO.getCustomerByPassEmail(customerEntity);


        Assert.assertEquals("sfsf@hfj.com",c.getEmailAddress());
        Assert.assertEquals("rererr",c.getPassword());



    }

    @Test
    public void getCustomerById(){

        CustomerDAO customerDAO = new CustomerDAO();
        CustomerEntity customerEntity = new CustomerEntity();

        //test
        CustomerEntity x = customerDAO.getCustomerById("765758");

        Assert.assertEquals("765758",x.getUserId());

    }

    @Test
    public void deleteCustomerById(){
        CustomerDAO customerDAO = new CustomerDAO();
        CustomerEntity customerEntity = new CustomerEntity();

        //test
        customerDAO.deleteById("765758");
        CustomerEntity p = customerDAO.getCustomerById("765758");

        Assert.assertEquals(null, p);

    }

}

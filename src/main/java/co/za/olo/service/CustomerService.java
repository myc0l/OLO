package co.za.olo.service;

import co.za.olo.DAO.CustomerDAO;
import co.za.olo.entities.CustomerEntity;

public class CustomerService {
    CustomerDAO customerDAO = new CustomerDAO();

    public CustomerEntity login(CustomerEntity customerEntity) {
         return customerDAO.getCustomerByPassEmail(customerEntity);
    }

    public void delete(String id){
        customerDAO.deleteById(id);
    }

    public void createCustomer(CustomerEntity customerEntity){
        customerDAO.createCustomer(customerEntity);
    }
}

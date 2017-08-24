package co.za.olo.DAO;

import co.za.olo.entities.CustomerEntity;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.WriteResult;
import org.mongojack.DBCursor;
import org.mongojack.DBQuery;
import org.mongojack.JacksonDBCollection;

import java.util.List;

public class CustomerDAO {

    Mongo mongo = new Mongo("localhost", 27017);
    DB db = mongo.getDB("dbOLO");
    DBCollection dbCollection = db.getCollection("CustomerCollection");

    JacksonDBCollection<CustomerEntity, String> collection = JacksonDBCollection.wrap(dbCollection, CustomerEntity.class, String.class);

    // signing up customer
    public CustomerEntity createCustomer(CustomerEntity customerEntity) {
        return collection.insert( customerEntity).getSavedObject();
    }

    //get customer
    public CustomerEntity getCustomerByPassEmail(CustomerEntity customerEntity){
        DBQuery.Query query = DBQuery.is("password",customerEntity.getPassword());
        query.is("emailAddress", customerEntity.getEmailAddress());


        List<CustomerEntity> customers = collection.find(query).toArray();
        if (customers.size()==0) {return null;}
        else {return customers.get(0);}

    }

    public CustomerEntity getCustomerById(String id){
        return collection.findOneById(id);
    }

    //delete customer
    public void deleteById(String id){collection.removeById(id);}

}

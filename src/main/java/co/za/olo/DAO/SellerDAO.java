package co.za.olo.DAO;


import co.za.olo.entities.SellerEntity;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import org.mongojack.*;


import java.util.List;

public class SellerDAO {

    Mongo mongo = new Mongo("localhost", 27017);
    DB db = mongo.getDB("dbOLO");
    DBCollection dbCollection = db.getCollection("SellerCollection");

    JacksonDBCollection<SellerEntity, String> collection = JacksonDBCollection.wrap(dbCollection, SellerEntity.class, String.class);

    //creating a new seller
    public SellerEntity createSeller(SellerEntity sellerEntity){
        return collection.insert(sellerEntity).getSavedObject();}

    //get seller
    public SellerEntity getSellerByPassEmail(SellerEntity sellerEntity){
        DBQuery.Query query = DBQuery.is("emailAddress",sellerEntity.getEmailAddress());
        query.is("password", sellerEntity.getPassword());

        List<SellerEntity> sellers = collection.find(query).toArray();
        if (sellers.size()==0) {return null;}
        else {return sellers.get(0);}

    }

    public SellerEntity getSellerById(String id){
       return collection.findOneById(id);

    }

    //locate stall
    public SellerEntity getStall(SellerEntity sellerEntity){
        DBQuery.Query query = DBQuery.is("location",sellerEntity.getLocation());
        DBCursor<SellerEntity> location = collection.find(query);
        return sellerEntity;
    }

    //review
    public SellerEntity createReview(SellerEntity reviewstall){
        return collection.insert(reviewstall).getSavedObject();}

    //edit review
    public SellerEntity updateReview(SellerEntity editreview) {

        return collection.save(editreview).getSavedObject();
    }

    //delete seller
    public void deleteStall(SellerEntity deletestall){collection.drop();}


}
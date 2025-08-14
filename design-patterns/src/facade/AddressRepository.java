package facade;

public class AddressRepository {

    public void save(String cep, String city, String state){
        System.out.println("Address saved: " + cep + ", " + city + ", " + state);
    }

}

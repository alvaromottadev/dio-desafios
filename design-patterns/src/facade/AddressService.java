package facade;

public class AddressService {

    private final CepService cepService = new CepService();
    private final AddressRepository addressRepository = new AddressRepository();

    public void saveAddress(String cep) {
        UtilsService.validateCep(cep);

        String city = cepService.findCityByCep(cep);
        String state = cepService.findStateByCep(cep);

        addressRepository.save(cep, city, state);
    }

}

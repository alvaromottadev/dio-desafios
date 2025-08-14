package facade;

public class UtilsService {

    public static void validateCep(String cep) {
        if (cep == null || cep.isEmpty() || !cep.matches("\\d{5}-?\\d{3}")) {
            throw new IllegalArgumentException("CEP cannot be null or empty");
        }
    }

}

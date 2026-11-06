import java.util.HashMap;

public class PersonnelFactory {

    public PersonObject createPersonnel(int type, HashMap<String, String> attributes) {
        switch (type) {
            case 1 -> {
                return new Employee(attributes);
            }
            case 2 -> {
                return new Executive(attributes);
            }
            case 3 -> {
                return new Volunteer(attributes);
            }
            case 4 -> {
                return new Security(attributes);
            }
            default -> throw new IllegalArgumentException("Unknown personnel type");
        }
    }
}

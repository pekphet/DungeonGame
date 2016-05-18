package cc.fish.simplegame.Person;

/**
 * Created by fish on 16-5-17.
 */
public class PersonDataHelper {
    private static PersonDataHelper instance = null;
    private PersonDataHelper(){
        super();
    }
    public static PersonDataHelper getInstance(){
        if (instance == null) {
            instance = new PersonDataHelper();
        }
        return instance;
    }
}

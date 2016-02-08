package sk.upjs.ics.mealplanet;

import java.util.List;

public interface UserDao {
    
    public void addUser(User user);
    
    public void deleteUser();
    
    public List<User> getUser(String uzivatelskeMeno, String heslo);
}

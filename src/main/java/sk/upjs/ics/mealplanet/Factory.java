package sk.upjs.ics.mealplanet;

public enum Factory {
    INSTANCE;
    
    private UserDao user;
    
    public UserDao getUser(){
        if(this.user==null){
            return new MySqlUserDao();
        } else{
            return this.user;
        }
    }
}

public class User {
    public int userId;
    public String username;
    public int userAge;

    public User(int id, String name, int age){
        this.userId = id;
        this.username = name;
        this.userAge = age;
    }

    @Override
    public String toString(){
        return "Username: " + username + ", UserId: " + userId;
    }
}
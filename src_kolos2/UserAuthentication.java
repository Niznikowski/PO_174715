public class UserAuthentication implements Authentication{
    private String username;
    private String password;
    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        return false;
    }
    @Override
    public  void logout(){
        System.out.println("Logged out");
    }
    @Override
    public  boolean resetPassword(String username, String password, String newPassword){
        if(this.username.equals(username) && this.password.equals(password)){
            this.password = newPassword;
            return true;
        }
        return false;
    }

}

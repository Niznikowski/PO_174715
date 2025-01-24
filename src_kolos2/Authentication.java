public interface Authentication {
    public abstract boolean login(String username, String password);
    public abstract void logout();
    public abstract boolean resetPassword(String username, String password, String newPassword);
}

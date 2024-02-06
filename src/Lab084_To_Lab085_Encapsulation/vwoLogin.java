package CoreJava.src.Lab084_To_Lab085_Encapsulation;

public class vwoLogin {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;
    private String password;

    vwoLogin(String u, String p) {
        this.username = u;
        this.password = p;
    }

    boolean isLogedin(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("Logged IN!!");
            return true;

        } else {
            System.out.println("Its Wrong ");
            return false;
        }

    }

    public static void main(String[] args) {
        vwoLogin vwoLogin = new vwoLogin("admin","password");

        boolean check = vwoLogin.isLogedin("admin", "password");
        System.out.println(check);
    }
}

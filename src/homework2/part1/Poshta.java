package homework2.part1;

public class Poshta {
    private String site;
    private String login;
    private String password;

    public Poshta() {
    }

    public Poshta(String site, String login, String password) {
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Poshta{" +
                "site='" + site + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public void login(){
        System.out.println(this.toString() + "You are logged in");
    }
}

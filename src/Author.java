import java.lang.*;
public class Author {
    private char gender;
    private String email;
    private String name;
    public Author(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(String email){
        return email;
    }
    public String getName(String name){
        return name;
    }
    public char getGender(char gender){
        return gender;
    }
    public void Info(){
        System.out.println("Author " + name + "(" + gender + ") at " + email);
    }
}

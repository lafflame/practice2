import java.lang.*;
public class TestAuthor {
    public static void main(String[] args){
        Author d1 = new Author("M.A.Bulgakov", "BulgakovMA@gmail.com", 'M' );
        Author d2 = new Author("A.S.Pushkin", "ASPushkin@mail.ru", 'M' );
        Author d3 = new Author("A.A.Akhmatova", "AkhmatovaAA@author.eu", 'F' );

        d1.Info();
        d2.Info();
        d3.Info();
    }
}

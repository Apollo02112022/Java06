public class Classroom {

    public static void main(String[] args) {

        Wilder jeanClaude = new Wilder("Jean-Claude", true);

        System.out.println(jeanClaude.whoAmI());

        Wilder henri = new Wilder("Henri", false);

        System.out.println(henri.whoAmI());
    }
} 

package Author;

public class TestAuthor {
    public TestAuthor() {
    }

    public static void main(String[] args) {
        Author first = new Author("Stas", "stasivo@stas.com", 'm');
        System.out.println(first);
        first.setEmail("atstasivo@stast.com");
        System.out.println(first);
    }
}

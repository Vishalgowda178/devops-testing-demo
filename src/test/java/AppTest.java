import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testPalindrome() {
        App app = new App();
        assertTrue(app.isPalindrome("madam"));
        assertTrue(app.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(app.isPalindrome("hello"));
        assertTrue(app.isPalindrome("121"));
        assertFalse(app.isPalindrome("1234"));
    }
}

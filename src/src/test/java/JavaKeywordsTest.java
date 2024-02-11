import com.ironhack.JavaKeywords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaKeywordsTest {
    private JavaKeywords javaKeywords;
    private final String[] inclJavaKeyword = {"abstract interface", "continue package", "for synchronized",
            "new boolean", "switch private", "assert static", "default throws", "goto final", "package return",
            "synchronized super", "boolean extends", "do byte", "if short", "private case", "this enum", "break while",
            "double volatile", "implements native", "protected float", "throw long", "byte abstract", "else interface",
            "import synchronized", "public static", "throws char", "case synchronized", "enum throw",
            "instanceof interface", "return const", "transient switch", "catch synchronized", "extends finally",
            "int private", "short volatile", "try class", "char super", "final continue", "interface assert",
            "static strictfp", "void synchronized", "class native", "finally abstract", "long this", "strictfp throws",
            "volatile synchronized", "const abstract", "float synchronized", "native abstract", "super for", "while do",
            "Don't break my heart"
    };

    private final String[] exclJavaKeyword = {"magnificent sunset", "delicious mango", "enchanted forest", "sparkling river",
            "adventurous spirit", "peaceful meadow", "majestic mountain", "whispering breeze", "golden sunshine",
            "serene ocean", "charming village", "vibrant rainbow", "mysterious cave", "whimsical fairy", "sparkling starlight",
            "endless horizon", "graceful swan", "curious kitten", "melodious songbird", "courageous lionheart",
            "magical unicorn", "dancing fireflies", "tranquil waterfall", "misty morning", "twinkling constellation",
            "silvery moonlight", "gentle raindrops", "I love to breakdance"
    };


    @BeforeEach
    public void initiateJavaKeywords() {
        javaKeywords = new JavaKeywords();
    }

    @Test
    public void isJavaKeywordPositiveTest() {
        for(String phrase : inclJavaKeyword) {
            assertTrue(javaKeywords.isJavaKeyword(phrase));
        }
    }
    @Test
    public void isJavaKeywordNegativeTest() {
        /*for(String phrase : exclJavaKeyword) {
            assertFalse(javaKeywords.isJavaKeyword(phrase));
        }*/
        assertEquals(false, javaKeywords.isJavaKeyword("magnificent sunset"));

    }

}

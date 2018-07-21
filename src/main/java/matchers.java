import org.hamcrest.core.IsSame;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class matchers {

    @Test
    public void everyItemGreaterThan1() {
        List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, everyItem(greaterThan(1)));
    }


    @Test
    public void isMatcherTest() {
        assertThat("Thanos", is("John"));
        assertThat(34, is(34));
    }

    @Test
    public void isnotMatcherTest() {
        assertThat("Thanos", is(not("John")));
    }

    @Test
    public void allOfMatcherTest() {
        assertThat("myValue", allOf(startsWith("my"), containsString("Val")));
    }

    @Test
    public void anyOfMatcherTest() {
        assertThat("myValue", anyOf(startsWith("your"), containsString("Val")));
    }

    @Test
    public void describedAsMatcherTest() {
        assertThat("Monday", describedAs("Monday is not Saturday.", is(not("Monday"))));
    }

    @Test
    public void isAnythingMatcherTest() {
        assertThat("Onur", is(anything("Bla Bla Bla")));
    }

    @Test
    public void isNotMatcherTest() {
        assertThat("onur", is(not(equalTo("mike"))));
    }

    String myStr = null;
    String myStr2 = "Onur";

    @Test
    public void isNullMatcherTest() {
        assertThat(myStr, is(nullValue()));
        assertThat(myStr2, is(notNullValue()));
    }

    @Test
    public void isSameMatcherTest() {
        String str1 = "Onur";
        String str2 = "Onur";

        assertThat(str1, IsSame.<String>sameInstance(str2));
    }

    @Test
    public void arrayHasSizeOf4() {
        Integer[] ints = new Integer[]{7, 5, 12, 16};

        assertThat(ints, arrayWithSize(4));

    }
}


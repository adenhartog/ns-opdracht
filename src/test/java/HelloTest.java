import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

    @Test
    void resultIsWorld() {
        String result = new Hello().call();
        assertThat(result).isEqualTo("world");
    }
}
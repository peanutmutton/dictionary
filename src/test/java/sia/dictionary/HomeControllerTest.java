package sia.dictionary;

import static org.assertj.core.api.Assertions.assertThat;

import  org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sia.dictionary.controller.HomeController;

@SpringBootTest
public class HomeControllerTest {

    @Autowired
    private HomeController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}

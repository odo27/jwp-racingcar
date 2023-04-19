package racingcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import racingcar.controller.RacingGameConsoleController;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        RacingGameConsoleController racingGameConsoleController = context.getBean(RacingGameConsoleController.class);
        racingGameConsoleController.run();
    }
}

import bot.MainBot;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

//@SpringBootApplication
public class MainClass {

    public static void main(String[] args) {
       // SpringApplication.run(MainClass.class, args);

        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new MainBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}
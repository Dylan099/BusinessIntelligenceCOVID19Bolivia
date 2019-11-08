package bot;


import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class BotMain extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);

    }

    @Override
    public String getBotUsername() {
        return "pruebaRLP_bot";
    }

    @Override
    public String getBotToken() {
        return "1048217369:AAFJ7frG5Aikq2ttTMHVi-rvCSHQEDtF1ws";
    }
}

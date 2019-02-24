package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());

        if(message.getText().toLowerCase().equals("привет")){
            sendMessage.setText("Привет, " + message.getFrom().getFirstName());
        }else if()



        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getBotUsername() {
        return "niatama_bot";
    }

    @Override
    public String getBotToken() {
        return "517397543:AAEBcGZk3ZgZ7yMLVOe06CfW0bmuITK6lzw";
    }
}

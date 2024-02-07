package development.manish.chatapplication.controller;

import development.manish.chatapplication.model.ChatMessage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.Assert;

@RunWith(MockitoJUnitRunner.class)
public class ChatControllerTest {

    @InjectMocks
    private ChatController chatController;

    @Test
    public void sendMessageSuccessTest() {

        ChatMessage chatMessage = new ChatMessage();
        chatController.sendMessage(chatMessage);
        Assert.notNull(chatMessage.getType());
    }
}

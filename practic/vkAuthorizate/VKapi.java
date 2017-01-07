package practic.vkAuthorizate;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by pan on 02.01.17.
 */
public class VKapi {
    private String client_id = "2971510";
    private String scope = "messages";
    private String redirect_uri = "http://oauth.vk.com/blank.html";
    private String display = "popup";
    private String response_type = "token";
    private String access_token;
    private String email = "******";//тут должен быть прописан email
    private String pass = "******";//тут должен быть прописан пароль

    public void setConnection() throws IOException, URISyntaxException {
        //Ранее описанный код получения token'a
    }

    public String getNewMessage() throws ClientProtocolException, IOException, NoSuchAlgorithmException, URISyntaxException {
        //Ранее описанный код получения списка сообщений
        return "Мessage for you";
    }
}



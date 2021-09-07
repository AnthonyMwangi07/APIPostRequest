import java.io.File;
import java.net.http.HttpResponse;

import unirest.Unirest;

public class PostRequest {
    public StringValue action(String POST_URL,String file)
    {

        Unirest.setTimeouts(0, 0);
        HttpResponse<String> response = Unirest.post(POST_URL)
        .field("file", new File(file))
        .asString();

        System.out.println(response.getBody());
        String response1=response.getBody();
        String response2=response1;

        return new StringValue (response2);

    }
}
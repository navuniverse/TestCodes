/**
 * 
 */
package http;

import java.net.URLEncoder;
import java.util.UUID;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author naveen.kumar
 * @date 02-Jan-2017
 */
public class HttpRequests {

	public static final String WHATS_APP = "https://api.wha.tools/v3/";

	public static void reply() {
		WhatsAppMessage whatsAppMessage = new WhatsAppMessage();
		whatsAppMessage.setTo("+919716554117");
		whatsAppMessage.setMessage("Test Message");
		whatsAppMessage.setStatus("New Message");
		whatsAppMessage.setId(UUID.randomUUID().toString());
		try {
			StringBuilder whatsAppReplyMessageUrl = new StringBuilder(WHATS_APP).append("message?key=").append("5f180d28-e310-4efc-a861-588b18e42982").append("&to=").append(whatsAppMessage.getTo())
					.append("&body=").append(URLEncoder.encode(whatsAppMessage.getMessage(), "UTF-8"));
			HttpPost request = new HttpPost(whatsAppReplyMessageUrl.toString());
			HttpClient httpClient = HttpClientBuilder.create().build();
			httpClient.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		reply();
	}
}

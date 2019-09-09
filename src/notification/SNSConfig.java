/**
 * 
 */
package notification;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.google.gson.Gson;

/**
 * @author naveen
 *
 * @date 08-Mar-2018
 */
public class SNSConfig {

	public static void main(String[] args) {

		AWSCredentials awsCredentials = new BasicAWSCredentials("SNS_USER_ACCESS_KEY_HERE", "SNS_SECRET_KEY_HERE");

		AmazonSNS snsClient =
				AmazonSNSClientBuilder.standard()
						.withRegion(Regions.AP_SOUTHEAST_1)
						.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
						.build();

		String message = "Hey There";
		String phoneNumber = "YourPhoneNumber";

		Map<String, MessageAttributeValue> smsAttributes = new HashMap<>();
		smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue().withStringValue("TEST").withDataType("String"));
		smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue().withStringValue("Transactional").withDataType("String"));

		PublishResult result = snsClient.publish(new PublishRequest().withMessage(message).withPhoneNumber(phoneNumber).withMessageAttributes(smsAttributes));

		System.out.println(new Gson().toJson(result));
	}

}

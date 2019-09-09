/**
 * 
 */
package twilio;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * @author naveen
 *
 * @date 29-Aug-2019
 */
public class TwilioNotificationSender {

	public static void main(String[] args) {
		Twilio.init("ACCOUNT_SID", "ACCOUNT_TOKEN");
		Message message = Message
				.creator(new PhoneNumber("YourToPhoneNumber"), // to
						new PhoneNumber("YourFromPhoneNumber"), // from
						"Hello")
				.create();

		System.out.println("Response of Sending SMS to Phone: [Status: " + message.getStatus() + ", ResourceId: " + message.getSid() + ", ErrorMessage: "
				+ message.getErrorMessage() + ", ErrorCode: " + message.getErrorCode() + "]");

	}
}
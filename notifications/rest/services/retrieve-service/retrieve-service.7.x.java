// NOTE: This example uses the next generation Twilio helper library - for more
// information on how to download and install this version, visit
// https://www.twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.notify.v1.Service;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACCOUNT_SID";
  public static final String AUTH_TOKEN = "AUTH_TOKEN";

  public static void main(String[] args) {
    // Initialize the client
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    // Fetch the service
    Service service = Service.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();

    System.out.println(service.toString());
  }
}

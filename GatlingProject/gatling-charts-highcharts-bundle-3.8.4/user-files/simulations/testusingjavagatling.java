
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class testusingjavagatling extends Simulation {


  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://opensource-demo.orangehrmlive.com")
      .inferHtmlResources(AllowList(), DenyList(".*\\.js", ".*\\.css", ".*\\.gif", ".*\\.jpeg", ".*\\.jpg", ".*\\.ico", ".*\\.woff", ".*\\.woff2", ".*\\.(t|o)tf", ".*\\.png", ".*detectportal\\.firefox\\.com.*"))
      .acceptHeader("application/json")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("en-US,en;q=0.9")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
    headers_0.put("Cache-Control", "max-age=0");
    headers_0.put("Origin", "https://opensource-demo.orangehrmlive.com");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "same-origin");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    headers_0.put("sec-ch-ua", "Google Chrome\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("Cache-Control", "max-age=0");
    headers_1.put("If-None-Match", "/RveX7hH7+0PZ5+FUVr/pX4WeN/w5Dn7zeeOwHWp+tA=");
    headers_1.put("Sec-Fetch-Dest", "empty");
    headers_1.put("Sec-Fetch-Mode", "cors");
    headers_1.put("Sec-Fetch-Site", "same-origin");
    headers_1.put("contentType", "application/json");
    headers_1.put("sec-ch-ua", "Google Chrome\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8");
    headers_2.put("Sec-Fetch-Dest", "image");
    headers_2.put("Sec-Fetch-Mode", "no-cors");
    headers_2.put("Sec-Fetch-Site", "same-origin");
    headers_2.put("sec-ch-ua", "Google Chrome\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24");
    headers_2.put("sec-ch-ua-mobile", "?0");
    headers_2.put("sec-ch-ua-platform", "Windows");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Cache-Control", "no-store, no-cache, must-revalidate, post-check=0, pre-check=0");
    headers_3.put("Sec-Fetch-Dest", "empty");
    headers_3.put("Sec-Fetch-Mode", "cors");
    headers_3.put("Sec-Fetch-Site", "same-origin");
    headers_3.put("sec-ch-ua", "Google Chrome\";v=\"107\", \"Chromium\";v=\"107\", \"Not=A?Brand\";v=\"24");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Windows");

         int nbUsers = Integer.getInteger("users", 1);
          long myRamp = Long.getLong("ramp", 0);

          System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%::::::::::::::::::::::::::::::::::::Welcome"+nbUsers);


          System.out.println("*****************************::::::::::::::::::::::::::::::::::::Welcome"+myRamp);


    ScenarioBuilder scn = scenario("testusingjavagatling")
      .exec(
        http("request_0")
          .post("/web/index.php/auth/validate")
          .headers(headers_0)
          .formParam("_token", "bc5df295621650ea2445b08f8325.W3pvsSo7J-VWqTwtphuovAa5qEjfxjEaPOKZZjBiKOI.FBwG4FlXQaYe5UhUxE_r2Xbo9xeJrlsuRob_KmNbeqMrNTbLfU5MvyfPcQ")
          .formParam("username", "Admin")
          .formParam("password", "admin123")
          .resources(
            http("request_1")
              .get("/web/index.php/core/i18n/messages")
              .headers(headers_1),
            http("request_2")
              .get("/web/images/orange.png?1666596668857")
              .headers(headers_2),
            http("request_3")
              .get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=5.5&currentDate=2022-11-16&currentTime=18:39")
              .headers(headers_3),
            http("request_4")
              .get("/web/index.php/api/v2/dashboard/employees/action-summary")
              .headers(headers_3),
            http("request_5")
              .get("/web/index.php/api/v2/dashboard/shortcuts")
              .headers(headers_3),
            http("request_6")
              .get("/web/index.php/api/v2/dashboard/employees/leaves?date=2022-11-16")
              .headers(headers_3),
            http("request_7")
              .get("/web/images/orangehrm-logo.png?1666596668857")
              .headers(headers_2),
            http("request_8")
              .get("/web/index.php/api/v2/dashboard/employees/subunit")
              .headers(headers_3),
            http("request_9")
              .get("/web/index.php/api/v2/dashboard/employees/locations")
              .headers(headers_3),
            http("request_10")
              .get("/web/index.php/pim/viewPhoto/empNumber/7")
              .headers(headers_2)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}

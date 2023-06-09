
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TestingSimulation extends Simulation {
  val nbUsers = Integer.getInteger("users", 1)
val myRamp = java.lang.Long.getLong("ramp", 0)

println("######################################Dhiraj Singh"+nbUsers)
  private val httpProtocol = http
    .baseUrl("https://opensource-demo.orangehrmlive.com")
    .inferHtmlResources(AllowList(), DenyList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""))
    .acceptHeader("application/json")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.9")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36")
  
  private val headers_0 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
  		"Cache-Control" -> "max-age=0",
  		"Origin" -> "https://opensource-demo.orangehrmlive.com",
  		"Sec-Fetch-Dest" -> "document",
  		"Sec-Fetch-Mode" -> "navigate",
  		"Sec-Fetch-Site" -> "same-origin",
  		"Sec-Fetch-User" -> "?1",
  		"Upgrade-Insecure-Requests" -> "1",
  		"sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_1 = Map(
  		"Cache-Control" -> "max-age=0",
  		"If-None-Match" -> "/RveX7hH7+0PZ5+FUVr/pX4WeN/w5Dn7zeeOwHWp+tA=",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"contentType" -> "application/json",
  		"sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_2 = Map(
  		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
  		"Sec-Fetch-Dest" -> "image",
  		"Sec-Fetch-Mode" -> "no-cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )
  
  private val headers_3 = Map(
  		"Cache-Control" -> "no-store, no-cache, must-revalidate, post-check=0, pre-check=0",
  		"Sec-Fetch-Dest" -> "empty",
  		"Sec-Fetch-Mode" -> "cors",
  		"Sec-Fetch-Site" -> "same-origin",
  		"sec-ch-ua" -> """Google Chrome";v="107", "Chromium";v="107", "Not=A?Brand";v="24""",
  		"sec-ch-ua-mobile" -> "?0",
  		"sec-ch-ua-platform" -> "Windows"
  )


  private val scn = scenario("TestingSimulation")
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
    )

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}

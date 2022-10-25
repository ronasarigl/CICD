package starter.account;

import static net.serenitybdd.rest.SerenityRest.*;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.equalTo;

public class GetAccount {

    private String Id, url;

    public void setInvalidUserId(){
        Id = "2203306141";
        url = "https://demoqa.com/Account/v1/User/2203306141";
    }

    public void requestGetAccount(){
        given().header("accept", "application/json");
        when().get(url);
    }

    public void validateStatusCode(){
        then().statusCode(401);
    }

    public void validateNotFoundMessage(){
        then().body(equalTo("{" +
                "\"code\":\"1200\"," +
                "\"message\":\"User not authorized!\"}"));
    }

}

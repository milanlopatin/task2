import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class GetRequest {

    @Test
    public void getRequest(){
        RestAssured.baseURI = "http://httpbin.org/get" ;
        Response response = RestAssured.get();

        System.out.println("Status code: " + response.getStatusCode());
    }
}
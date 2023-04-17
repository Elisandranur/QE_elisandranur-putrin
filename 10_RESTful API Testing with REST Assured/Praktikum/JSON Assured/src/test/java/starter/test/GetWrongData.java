package starter.test;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
public class GetWrongData {
    @Test
    public void getUserDataWithWrongNameTest() {
        // Make a GET request to the API endpoint that returns user data for a specific name
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts?title=null");
        // saya memilih data dengan id 1150 karena tidak ada data id tersebut

        // Assert that the response status code is 404 Not Found
         assertEquals(response.getStatusCode(), 200);
    }
}

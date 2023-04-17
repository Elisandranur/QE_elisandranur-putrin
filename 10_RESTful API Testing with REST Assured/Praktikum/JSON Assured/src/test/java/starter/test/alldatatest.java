package starter.test;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
public class alldatatest {
    @Test
    public void getAllUserDataTest() {
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");

        assertEquals(response.getStatusCode(), 200);

        List<Map<String, Object>> users = response.jsonPath().getList("$");

        // Verify that the list contains all the users are expecting
        assertTrue(users.size() >= 3); // kira-kira data yang mau diambil paling tidak harus ada 3 data
        assertTrue(users.stream().anyMatch(user -> user.get("title").equals("qui est esse")));
        assertTrue(users.stream().anyMatch(user -> user.get("title").equals("eum et est occaecati")));
        assertTrue(users.stream().anyMatch(user -> user.get("title").equals("magnam ut rerum iure")));
        // ... bisa ditambah lagi
    }
}

package tests;

import com.companynames.Utils.JsonUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class JsonUtilTest {

    public static void main(String[] args) throws IOException, URISyntaxException {
        String userInformation= JsonUtils.readJsonFile("user-data.json");
        System.out.println(userInformation);

    }
}

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadJsonFile {
    public static void main(String[] args)
            throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        // JSON 파일 읽기
        Reader reader = new FileReader("C:\\java\\test.json");
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        String name = (String) jsonObject.get("name");
        long id = (Long) jsonObject.get("id");
        long price = (Long) jsonObject.get("price");

        System.out.println(name);  // apple
        System.out.println(id);  // 1
        System.out.println(price);  // 1000

    }

}
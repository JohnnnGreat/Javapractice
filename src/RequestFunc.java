import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class RequestFunc {
    void getDetails(){
        try{
            URI uri = new URI("http://localhost:8080/cuisines/approvedcuisines");
            URL url = uri.toURL();

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();


            System.out.println("API Response: " + response.toString());
            connection.disconnect();


        }catch(Exception e) {
       e.printStackTrace();
        }
    }

}

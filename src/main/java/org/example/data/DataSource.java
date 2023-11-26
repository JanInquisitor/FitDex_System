package org.example.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.product.Product;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

import static java.net.http.HttpRequest.*;

// This class is used for testing purposses
public class DataSource {

    Gson gson = new GsonBuilder().create();

    List<Product> productList;

    public static class ParameterStringBuilder {
        public static String getParamsString(Map<String, String> params) throws UnsupportedEncodingException {
            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, String> entry : params.entrySet()) {
                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                result.append("&");
            }

            String resultString = result.toString();
            return resultString.length() > 0
                    ? resultString.substring(0, resultString.length() - 1)
                    : resultString;
        }
    }

    public DataSource(List<Product> productList) {
        this.productList = productList;
    }

    public DataSource() {
        fillFoodList();
    }

    // This method uses the old HttpURLConnection library.
    public void httpCallOld() throws IOException {
        URL url = new URL("http://example.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

//        String contentType = con.getHeaderField("Content-Type");

        Map<String, String> parameters = new HashMap<>();
        parameters.put("param1", "val");

        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
        out.flush();
        out.close();
    }

    public String httpCallTest() throws URISyntaxException, IOException, InterruptedException {
//        HttpRequest.Builder client = HttpRequest.newBuilder();

        Builder requestBuilder = newBuilder(new URI("https://postman-echo.com/get"));

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    private void fillFoodList() {
        this.productList = new ArrayList<>(); // Initialize the productList

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setId((long) (i + 1)); // Assuming IDs start from 1
            product.setName("Product" + (i + 1));
            product.setDescription("Description for Product" + (i + 1));
            product.setBrand("Brand" + (i + 1));
            product.setIngredients("Ingredient" + (i + 1));
            product.setLocation("Location" + (i + 1));
            product.setNutritionalInformation("Nutritional Info for Product" + (i + 1));
            product.setImageUrl("https://example.com/image" + (i + 1) + ".jpg");
            product.setPrice(random.nextDouble() * 100); // Random price between 0 and 100

            productList.add(product);
        }
    }


    @Override
    public String toString() {
        return "DataSource{" +
                "productList=" + productList +
                '}';
    }
}

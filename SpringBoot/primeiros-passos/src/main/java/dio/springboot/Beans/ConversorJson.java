package dio.springboot.Beans;

import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson; // não precisou insttanciar pois ele é um bean agora.
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}
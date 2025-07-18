package com.weyrich.soap;

import com.weyrich.soap.generated.example.WeatherServicePortType;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;
import org.springframework.stereotype.Service;


@WebService
@Service
@BindingType(
        value = jakarta.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public class SoapExampleController implements WeatherServicePortType {
    @Override
    public String getWeather(String city) {
        return "";
    }
}

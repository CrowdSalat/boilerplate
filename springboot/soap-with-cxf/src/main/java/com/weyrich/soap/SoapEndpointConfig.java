package com.weyrich.soap;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoapEndpointConfig {
    @Bean
    public Endpoint documentServerWSEndpoint(SpringBus springBus, SoapExampleController soapExampleController) {
        EndpointImpl lDocumentServerWSEndpoint = new EndpointImpl(springBus, soapExampleController);
        // /services/example
        lDocumentServerWSEndpoint.publish("/example");
        return lDocumentServerWSEndpoint;
    }
}

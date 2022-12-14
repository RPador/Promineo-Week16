/**
 * 
 */
package com.promineotech.jeep.controller.support;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import com.promineotech.jeep.entity.Jeep;
import lombok.Getter;

public class CreateOrderTestSupport {
    
    @LocalServerPort
    private int serverPort;
    
    @Autowired
    @Getter
    private TestRestTemplate restTemplate;
    
    /**
     * 
     * @return
     */
    protected String getBaseUriForJeeps() {
        return String.format("http://localhost%d/jeeps", serverPort);
        }
    /**
     * 
     * @return
     */
    protected String getBaseUriForOrders() {
        return String.format("http://localhost%d/orders", serverPort);
        }
    
    
}
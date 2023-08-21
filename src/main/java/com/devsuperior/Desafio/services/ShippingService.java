package com.devsuperior.Desafio.services;

import com.devsuperior.Desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
         if (order.getBasic() < 100){
             return 20.00;
         }
         if (order.getBasic() <= 200 && order.getBasic() >= 100){
             return 12.00;
         }
         else {
             return 0.0;
         }
    }
}

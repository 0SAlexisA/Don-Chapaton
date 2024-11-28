package com.example.api.controllers;

import com.example.api.models.Pedido;
import org.springframework.web.bind.annotation.*;

@RestController
public class PedidoController {

    @PostMapping("/pedido")
    public String generarPedido(@RequestBody Pedido pedido) {
        String ticket = String.format("""
                Pedido generado:
                Chapata: %s
                Papas: %s
                Bebida: %s
                
                Su pedido ha sido tomado con éxito.
                """, 
                pedido.getChapata(), 
                pedido.getPapas() == null ? "Sin papas" : pedido.getPapas(),
                pedido.getBebida() == null ? "Sin bebida" : pedido.getBebida());
        
        return ticket;
    }
}
package com.example.api.controllers;

import com.example.api.models.Pedido;
import org.springframework.web.bind.annotation.*;

@RestController // Anotación que marca esta clase como un controlador REST, gestionando solicitudes HTTP.
public class PedidoController {

    /**
     * Maneja solicitudes POST al endpoint "/pedido".
     * Recibe un objeto de tipo Pedido en el cuerpo de la solicitud y genera un ticket como respuesta.
     * @param. pedido Objeto recibido en formato JSON con los detalles del pedido.
     * return Cadena de texto con los detalles del pedido en formato de ticket.
     */

    @PostMapping("/pedido")
    public String generarPedido(@RequestBody Pedido pedido) {
         // Formatea un ticket con los detalles del pedido usando los valores proporcionados.
        // Si las papas o la bebida no están especificadas, muestra un mensaje predeterminado.
        
        String ticket = String.format("""
                Pedido generado:
                Chapata: %s
                Papas: %s
                Bebida: %s
                
                Su pedido ha sido tomado con éxito.
                """, 
                pedido.getChapata(), // Obtiene el tipo de chapata.
                pedido.getPapas() == null ? "Sin papas" : pedido.getPapas(), // Muestra "Sin papas" si no se especificaron.
                pedido.getBebida() == null ? "Sin bebida" : pedido.getBebida()); // Muestra "Sin bebida" si no se especifico.
        
        return ticket; // Retorna el ticket como respuesta al cliente.
    }
}
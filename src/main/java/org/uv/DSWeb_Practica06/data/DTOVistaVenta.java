/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.DSWeb_Practica06.data;

import java.sql.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author chris
 */
@NoArgsConstructor
@Data
public class DTOVistaVenta {
    private Long id;
    private Date fecha;
    private double total;
    private List<DetalleVenta> detalleList;
    
    public void llenarVista(Venta v, List<DetalleVenta> list){
        this.detalleList = list;
        this.id = v.getId();
        this.fecha = v.getFecha();
        this.total = v.getTotal();
    }
}

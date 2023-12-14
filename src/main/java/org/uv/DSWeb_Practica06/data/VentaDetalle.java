/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.DSWeb_Practica06.data;

import java.math.BigDecimal;

/**
 *
 * @author chris
 */
public class VentaDetalle {
    private int cantidad;
    private String descripcion;
    private BigDecimal precio;
    private Long idProducto;

    public VentaDetalle(int cantidad, String descripcion, BigDecimal precio, Long idProducto) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    
    
    
}

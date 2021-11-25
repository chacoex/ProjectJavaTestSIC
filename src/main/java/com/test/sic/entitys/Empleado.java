package com.test.sic.entitys;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "empleado")
public class Empleado{
    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empleado;
    @Column(name = "dependencia")
    private String dependencia;
    @Column(name = "fecha_ingreso")
    private Date fecha_ingreso;


    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
}

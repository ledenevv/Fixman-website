package com.example.application.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "services_list")
public class ServicesList {
    @Id
    @Column(name = "id_service", nullable = false)
    private Integer id;

    @Size(max = 60)
    @NotNull
    @Column(name = "service_name", nullable = false, length = 60)
    private String serviceName;

    @Size(max = 250)
    @Column(name = "service_descr", length = 250)
    private String serviceDescr;

    @NotNull
    @Column(name = "price", nullable = false)
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescr() {
        return serviceDescr;
    }

    public void setServiceDescr(String serviceDescr) {
        this.serviceDescr = serviceDescr;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
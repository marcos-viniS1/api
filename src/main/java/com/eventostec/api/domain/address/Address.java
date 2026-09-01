package com.eventostec.api.domain.address;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import com.eventostec.api.domain.event.Event;

import java.util.UUID;

@Table(name = "address")
@Entity

public class Address {

    @Id
    @GeneratedValue
    private UUID id;
    private String cidade;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}

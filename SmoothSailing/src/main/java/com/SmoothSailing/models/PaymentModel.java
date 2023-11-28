package com.SmoothSailing.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name="payment")
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String oib;
    @Column
    private String iban;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user_id;
}

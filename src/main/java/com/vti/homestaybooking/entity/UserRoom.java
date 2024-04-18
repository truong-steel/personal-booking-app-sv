package com.vti.homestaybooking.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "user_room")
public class UserRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(name = "user_id")
//    private Long userId;
    @Column(name="check_in")
    private LocalDate checkInDate;
    @Column(name="check_out")
    private LocalDate checkOutDate;
    @Column(name="total_guest")
    private int totalGuest;
    @Column(name="created_at")
    @CreationTimestamp
    private LocalDate createdAt;
    @Column(name="updated_at")
    @UpdateTimestamp
    private LocalDate updatedAt;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "room_id" , nullable = false)
    private Room room;
}

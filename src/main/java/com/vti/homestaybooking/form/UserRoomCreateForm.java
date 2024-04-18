package com.vti.homestaybooking.form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class UserRoomCreateForm {
    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private int totalGuest;

}

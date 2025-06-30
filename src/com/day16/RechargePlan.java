package com.day16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RechargePlan {
	String provider;
    int price;
    int validityDays;
    double dataPerDay;
    String benefits;
    LocalDate activationDate;

    public RechargePlan(String provider, int price, int validityDays, double dataPerDay, String benefits, LocalDate activationDate) {
        this.provider = provider;
        this.price = price;
        this.validityDays = validityDays;
        this.dataPerDay = dataPerDay;
        this.benefits = benefits;
        this.activationDate = activationDate;
    }

    public LocalDate getExpiryDate() {
        return activationDate.plusDays(validityDays);
    }

    public long getRemainingDays() {
        return ChronoUnit.DAYS.between(LocalDate.now(), getExpiryDate());
    }

    @Override
    public String toString() {
        return String.format(
            "%s - ₹%d - %d days - %.1fGB/day - %s - Activated: %s - Expires: %s - Remaining: %d days",
            provider, price, validityDays, dataPerDay, benefits,
            activationDate.format(DateTimeFormatter.ISO_DATE),
            getExpiryDate().format(DateTimeFormatter.ISO_DATE),
            getRemainingDays()
        );
    }
}


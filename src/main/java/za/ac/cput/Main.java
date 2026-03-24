package za.ac.cput;

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Payment;
import za.ac.cput.domain.Review;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Booking booking = new Booking.Builder()
                .setBookingId("B001")
                .setCustomerId("OP323381")
                .setCarId("CAA2345GP")
                .setDate(LocalDate.now())
                .setStartTime(LocalTime.of(8, 00))
                .setEndTime(LocalTime.of(17, 00))
                .setPrice(5000.0)
                .setPayment(new Payment())
                .build();


        Review review = new Review.Builder()
                .setReviewId("R051")
                .setCustomerId("C001")
                .setCarId("CAB0134GP")
                .setRating(5)
                .setComment("")
                .build();

        System.out.println(booking);
        System.out.println(review);

    }

}
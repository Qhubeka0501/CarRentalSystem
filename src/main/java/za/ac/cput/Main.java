package za.ac.cput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create Payment properly using Builder
        Payment payment = new Payment.Builder()
                .setPaymentId("P001")
                .setAmount(5000.0)
                .setPaymentMethod("Card")
                .setPaymentDate("2026-03-25")
                .build();


        Booking booking = new Booking.Builder()
                .setBookingId("B001")
                .setCustomerId("OP323381")
                .setCarId("CAA2345GP")
                .setDate(LocalDate.now())
                .setStartTime(LocalTime.of(8, 0))
                .setEndTime(LocalTime.of(17, 0))
                .setPrice(5000.0)
                .setPayment(payment)
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
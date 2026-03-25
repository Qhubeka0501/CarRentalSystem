package Factory;

import za.ac.cput.domain.Review;

public class ReviewFactory {

    public static Review createReview(String reviewId,String customerId,String carId,int rating,
                                      String comment){


        if (reviewId == null || customerId == null || carId == null) {
            throw new IllegalArgumentException("IDs cannot be null");
        }

        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }

        return new Review.Builder()
                .setReviewId(reviewId)
                .setCustomerId(customerId)
                .setCarId(carId)
                .setRating(rating)
                .setComment(comment)
                .build();
    }
}

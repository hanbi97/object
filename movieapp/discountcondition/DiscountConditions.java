package movieapp.discountcondition;

import movieapp.movie.Screening;

public interface DiscountConditions {
    boolean isSatisfiedBy(Screening screening);
}

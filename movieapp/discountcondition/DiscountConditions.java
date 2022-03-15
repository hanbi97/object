package movieapp.discountcondition;

import movieapp.Screening;

public interface DiscountConditions {
    boolean isSatisfiedBy(Screening screening);
}

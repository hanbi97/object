package movieapp.discountpolicy;

import movieapp.money.Money;
import movieapp.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}

package movieapp.discountpolicy;

import movieapp.Money;
import movieapp.Screening;

public class NoneDiscountPolicy extends DiscountPolicy{
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}

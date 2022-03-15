package movieapp.discountpolicy;

import movieapp.money.Money;
import movieapp.movie.Screening;
import movieapp.discountcondition.DiscountConditions;

public class PercentDiscountPolicy extends DiscountPolicy{
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountConditions... discountConditions) {
        super(discountConditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}

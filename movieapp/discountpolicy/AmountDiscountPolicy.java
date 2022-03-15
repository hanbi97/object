package movieapp.discountpolicy;

import movieapp.money.Money;
import movieapp.movie.Screening;
import movieapp.discountcondition.DiscountConditions;

public class AmountDiscountPolicy extends DiscountPolicy{
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountConditions ... discountConditions){
        super(discountConditions);
        this.discountAmount=discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}

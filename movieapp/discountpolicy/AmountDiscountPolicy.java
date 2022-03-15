package movieapp.discountpolicy;

import movieapp.Money;
import movieapp.Screening;
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

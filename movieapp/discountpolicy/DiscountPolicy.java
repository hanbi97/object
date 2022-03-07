package movieapp.discountpolicy;

import movieapp.discountcondition.DiscountConditions;

import java.util.List;

public class DiscountPolicy {
    private PriceDiscountPolicy priceDiscountPolicy;
    private RatioDiscountPolicy ratioDiscountPolicy;
    private List<DiscountConditions> discountConditionsList;

    public DiscountPolicy(PriceDiscountPolicy priceDiscountPolicy, RatioDiscountPolicy ratioDiscountPolicy) {
        this.priceDiscountPolicy = priceDiscountPolicy;
        this.ratioDiscountPolicy = ratioDiscountPolicy;
    }

    public void setDiscountConditionsList(DiscountConditions ... discountConditions){
        this.discountConditionsList = List.of(discountConditions);
    }
}

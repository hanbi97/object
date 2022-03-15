package movieapp.discountpolicy;

import movieapp.money.Money;
import movieapp.movie.Screening;
import movieapp.discountcondition.DiscountConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountConditions> discountConditions = new ArrayList<>();

    public DiscountPolicy(DiscountConditions ... discountConditions) {
        this.discountConditions = Arrays.asList(discountConditions);
    }

    public Money calculateDiscountAmount(Screening screening){ //공통적으로 가격 계산하는..
        for(DiscountConditions d : discountConditions){
            if(d.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening); //실제 요금 계산하는 로직은 자식한테
}

package movieapp;

//BigDecimal: 자바에서 숫자 정밀하게 저장하는 자료구조, double 한계때문에 오차 발생
//느리긴한데 돈계산할때 사용해야됨

import java.math.BigDecimal;

public class Money {
    public static final Money ZERO = Money.wons(0);
    private final BigDecimal amount;

    public static Money wons(long amount){
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount){
        return new Money(BigDecimal.valueOf(amount));
    }

    Money(BigDecimal amount){
        this.amount = amount;
    }

    public Money plus(Money amount){
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount){
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent){
        return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money other){
        return amount.compareTo(other.amount)<0;
    }

    public boolean isGreaterThanOrEqual(Money other){
        return amount.compareTo(other.amount)>=0;
    }
}

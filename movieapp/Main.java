package movieapp;

import movieapp.discountpolicy.AmountDiscountPolicy;
import movieapp.discountpolicy.PercentDiscountPolicy;
import movieapp.money.Money;
import movieapp.movie.Movie;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Movie avatar = new Movie("Avatar",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(Money.wons(1000,,,)));

        avatar.changeDiscountPolicy(new PercentDiscountPolicy(0.1,,,,)); //인스턴스로 관계 설정, 합성 통해서 할인 정책 유연하게 변경 가능
    }
}

package movieapp.movie;

import movieapp.money.Money;
import movieapp.discountpolicy.DiscountPolicy;

import java.time.Duration;

public class Movie {
    private String name;
    private Duration runningTime; //시간 사이 간격 나타내는..
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String name, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.name = name;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee(){
        return fee;
    }

    public Money calculateMovieFee(Screening screening){
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
        //할인 정책 종류를 판단하는 코드는 어디에도 존재하지 않는다. 그냥 계산하라고 메시지 전달
    }
}

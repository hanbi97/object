package movieapp;

import movieapp.discountpolicy.DiscountPolicy;

import java.util.List;
import java.util.Optional;

public class Movie {
    private String name;
    private Long price;
    private List<Screening> screeningList;
    private Optional<DiscountPolicy> discountPolicy;

    public Movie(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    public void addScreeningList(Screening screening){
        screeningList.add(screening);
    }

    public void addDiscountPolicy(DiscountPolicy discountPolicy){
        this.discountPolicy= Optional.ofNullable(discountPolicy);
    }
}

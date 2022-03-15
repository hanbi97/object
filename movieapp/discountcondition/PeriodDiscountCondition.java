package movieapp.discountcondition;

import movieapp.movie.Screening;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodDiscountCondition implements DiscountConditions{
    private LocalTime startTime;
    private LocalTime endTime;
    private DayOfWeek dayOfWeek; //특정 날짜 요일 숫자로 구하는 자료형

    public PeriodDiscountCondition(LocalTime startTime, LocalTime endTime, DayOfWeek dayOfWeek) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime())<=0 &&
                endTime.compareTo(screening.getStartTime().toLocalTime())>0;
    }
}

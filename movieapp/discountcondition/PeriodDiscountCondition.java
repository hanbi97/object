package movieapp.discountcondition;

import java.time.LocalDateTime;

public class PeriodDiscountCondition {
    private LocalDateTime screeningStart;
    private LocalDateTime screeningEnd;

    public PeriodDiscountCondition(LocalDateTime screeningStart, LocalDateTime screeningEnd) {
        this.screeningStart = screeningStart;
        this.screeningEnd = screeningEnd;
    }
}

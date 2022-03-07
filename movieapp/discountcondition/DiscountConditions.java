package movieapp.discountcondition;

public class DiscountConditions {
    private PeriodDiscountCondition periodDiscountCondition;
    private SequenceDiscountCondition sequenceDiscountCondition;

    public DiscountConditions(PeriodDiscountCondition periodDiscountCondition, SequenceDiscountCondition sequenceDiscountCondition) {
        this.periodDiscountCondition = periodDiscountCondition;
        this.sequenceDiscountCondition = sequenceDiscountCondition;
    }
}

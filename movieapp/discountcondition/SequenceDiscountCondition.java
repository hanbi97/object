package movieapp.discountcondition;

import movieapp.Screening;

public class SequenceDiscountCondition implements DiscountConditions{
   private int sequence;

    public SequenceDiscountCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}

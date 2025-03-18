package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int CountOut() {
        while (!callCheck())
            temp.countIn(super.CountOut());

        int ret = temp.CountOut();

        while (!temp.callCheck())
            countIn(temp.CountOut());

        return ret;
    }
}

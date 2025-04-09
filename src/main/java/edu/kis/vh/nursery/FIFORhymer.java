package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int сountOut() {
        while (!callCheck())
            temp.сountIn(super.сountOut());

        int ret = temp.сountOut();

        while (!temp.callCheck())
            сountIn(temp.сountOut());

        return ret;
    }
}

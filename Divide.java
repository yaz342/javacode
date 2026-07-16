class Divide {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        } 
        boolean isNegative= dividend<0 ^ divisor<0;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int quotient=0;
        while(dividend-divisor>=0){
            int c=divisor;
            int q=1;
            while(dividend-(c<<1)>=0){
                c=c<<1;
                q=q<<1;
            } quotient+=q;
            dividend-=c;
        } return isNegative? -quotient:quotient;
    }
}
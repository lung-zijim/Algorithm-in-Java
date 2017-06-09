public class Power {
    public long power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        long half = power(a, b / 2);
        return b % 2 == 0? half * half : half * half * half * a;
    }
}



/**
2 * 2 * 2 * 2 = 16

                 (2 , 4) 16
                   |      
                 (2, 2) 2 * 2 = 4
                   |
                 (2, 1) 1 * 1 * 2 = 2
                   |
                 (2, 0) 1


 **/








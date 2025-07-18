package lloops;
public class prime_num_upto_100 {
    public static void main(String[] args) {
        int i = 2; 
        
        while (i < 100) {
            int j = 2;
            int c=0;
            while (j < i) {
                if (i % j == 0)
                {
                	c++;
                }
         
                j++;
            }
            if (c==0)
            	{
            	System.out.println(i);
            	}
            i++;
        }
    }
}

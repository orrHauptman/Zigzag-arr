   public static boolean zigzag(int[] a)
    {
        return zigzag(a , 0);
    }
    
    private static boolean zigzag(int [] a , int i)
    {
        if(i == a.length -1)
            return true;
            
        if( i % 2 == 0)
            return a[i] < a[i+1] && zigzag(a , i + 1);
        
        return a[i] > a[i+1] && zigzag(a , i+1);
    }

class enum1
{
     enum month
     {
        JAN(1),FEB(2),MAR(3);
        
        private int value;

        private month(int value)
        {
            this.value=value;
        }

        int getValue()
        {
            return value;
        }
     }
     public static void main(String[] args) 
     {
        for(month m: month.values())
        {
            System.out.println(m + " " + m.getValue());
        }
     }
}

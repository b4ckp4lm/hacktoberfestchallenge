class prime
{
    public void main(int a)
    {
        int c = 0;
        for (int i = 1; i<=a; i++)
        {
            if (a % i == 0)
            {
                c++;
            }
        }
        if (c == 2)
        {
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}
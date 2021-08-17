public class IntreptExample {

    public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            public void run()
            {
                try
                {
                    Thread.sleep(10000);        //Thread is sleeping for 10 seconds
                }
                catch (InterruptedException e)
                {
                    System.out.println("Thread is interrupted");
                }
            }
        };

        t.start();

        try
        {
            Thread.sleep(3000);      //Main thread is sleeping for 3 seconds
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        t.interrupt();         //main thread is interrupting thread t
    }
}


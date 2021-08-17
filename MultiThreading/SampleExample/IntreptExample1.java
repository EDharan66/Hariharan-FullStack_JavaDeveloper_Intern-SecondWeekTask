public class IntreptExample1 {

    public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            public void run()
            {
                for(int i = 0; i <= 1000; i++)
                {
                    System.out.println(i);
                }

                try
                {
                    Thread.sleep(10000);        //Thread is going to sleep for 10 seconds
                }
                catch (InterruptedException e)
                {
                    System.out.println("Thread is interrupted");
                }
            }
        };

        t.start();

        t.interrupt();         //main thread is interrupting thread t
    }

}



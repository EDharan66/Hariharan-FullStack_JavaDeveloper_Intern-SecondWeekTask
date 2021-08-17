import java.lang.ref.SoftReference;

public class ThreadGroupExample{
    public static void main(String[] args)
    {
        //Creating Thread Group

        ThreadGroup parentGroup = new ThreadGroup("Parent Group ");

        Thread t1 = new Thread(parentGroup, "Thread 1")
        {
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        t1.start();

        Thread t2 = new Thread(parentGroup, "Thread 2")
        {
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        t2.start();

        ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Group");

        Thread t3 = new Thread(childGroup, "Thread 3")
        {
            public void run()
            {
                try
                {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };

        t3.start();

        //Enumerating all active threads

        Thread[] threads = new Thread[parentGroup.activeCount()];
        int group = parentGroup.activeGroupCount();

        System.out.println(group);

        int No_Of_Active_Threads = parentGroup.enumerate(threads);

        System.out.println(No_Of_Active_Threads);

        for (Thread thread : threads)
        {
            System.out.println(thread.getName());
        }



    }
}


/**
 *
 * getParent() Method
 * setDaemon() And isDaemon() Methods
 * setMaxPriority() And getMaxPriority() Methods
 * activeCount() and activeGroupCount() Methods
 * interrupt() Method
 * destroy() Method
 * enumerate() Method
 *
  */

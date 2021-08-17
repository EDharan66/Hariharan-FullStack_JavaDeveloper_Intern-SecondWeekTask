public class CallRunExample {

        public static void main(String[] args)
        {
            Thread t = new Thread()
            {
                public void run()
                {
                    System.out.println(Thread.currentThread().getName());    //Output : main
                }
            };

            t.run();
            t.start();
        }

}

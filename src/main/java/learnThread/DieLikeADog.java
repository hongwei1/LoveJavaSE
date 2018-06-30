package learnThread;


public class DieLikeADog {
    private static Object s = new Object();
    private static int count = 0;
    public static void main(String[] argv){
        for(;;){
            new Thread(new Runnable(){
                    public void run(){
                        synchronized(s){
                            count += 1;
                            System.err.println("New thread #"+count);
                        }
                        for(;;){
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e){
                                System.err.println(e);
                            }
                        }
                    }
                }).start();
        }
    }
}

//I get the following threads:
//New thread #2023
//New thread #2024
//Exception in thread "main" java.lang.OutOfMemoryError: unable to create new native thread
//	at java.lang.Thread.start0(Native Method)
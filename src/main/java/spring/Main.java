package spring;


public class Main {

    public static void main(String[] args) {
        System.out.println("sdfsdfsdfsdjflskdfjsdfsdfdsfdsfdsfdsf");
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");


                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }

            while (true){
                System.out.println("oiii");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

}

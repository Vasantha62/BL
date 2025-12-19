public class Uc1 {
    public static void main(String[] args){
        int isFullTime = 1;
        double check = Math.floor(Math.random() * 10) % 2;
        if(check == isFullTime){
        System.out.println("employee is present");
        }else{
            System.err.println("employee is absent");
        }

    }
    
}

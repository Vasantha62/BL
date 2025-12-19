//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <S> void printArray(S[] array){
         for(int i = 0 ; i<array.length; i++){
             S element = array[i];
             System.out.print(element + " ");
         }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4};
        Double[] b = {111.3, 3.4, 55.90};
        String[] name ={"Vasantha", "Manju", "Manu"};
        printArray(a);
        printArray(b);
        printArray(name);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}

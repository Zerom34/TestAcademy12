package HomeWork_1;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber());
    }
    private static String createPhoneNumber(){
         int[] x = new int[10];
        for (int i = 0; i < 10; i++){
            x[i] = (int) (Math.random() * 10);
        }
        return "(" + x[0] + x[1] + x[2] + ") " + x[3] + x[4]+ x[5] + "-" + x[6]+ x[7]+ x[8]+ x[9];
    }
}

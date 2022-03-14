package amio;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        int n = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.println(i+ "");
//            }
//            System.out.println("Showing the number of iteration!!!):):):)");
//        }
        Football f = new Football() {
            public void show() {
                System.out.println("Play and Run");
            }
        };
        f.show();

   }
}

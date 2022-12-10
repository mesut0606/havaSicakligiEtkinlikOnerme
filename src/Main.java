import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /**   Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini önerKoşullar :


*/      int heat;
        Scanner input= new Scanner(System.in);

        System.out.println("Sıcaklığı giriniz:");
        heat = input.nextInt();
        
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz");} else if (heat >=5 && heat<15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }else if(heat ==15){
            System.out.println("Sinemaya gidebilirsiniz");
            System.out.println("Piknige gidebilirsiniz");} else if (heat >=15 && heat <=25) {
            System.out.println("Piknige gidebilirsiniz");}
        else {
            System.out.println("Yüzmeye gidebilirsiniz");

        }


    }
}
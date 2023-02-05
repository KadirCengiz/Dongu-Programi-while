public class Main {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi.

        int i=1;//left=100,right=200;
        int k;

        //Açıklama satırı işlemi.

        System.out.println("Program başladı.");

        //While Left,right uygulama işlemi.

        int left = 100, right = 200;

        while (++left < --right);

        System.out.println("100 ile 200'ün ortası: " + left);

        //While döngüsü işlemi.

        while (i<=5){
            System.out.println(i);

            //İç içe while döngüsü oluşturma.

            k=1;
            while (k<=10){
                System.out.print(k +",");
                k++;
            }

            System.out.println();
            i++;
        }

        //Programı sonlandırma satırı.

        System.out.println("Program bitti.");
    }
}
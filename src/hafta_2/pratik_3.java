/*
Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapın.
 */

/*
Ekstra:
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise
ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
"Şifre oluşturuldu" yazan programı yazınız.
 */

package hafta_2;
import java.util.Objects;
import java.util.Scanner;

public class pratik_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String true_name = "Lokman", true_pass = "21!+&dfgas5AS%";
        System.out.print("Kullanıcı adınızı giriniz: ");
        String input_name = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        String input_pass = input.nextLine();

        if(!Objects.equals(true_name, input_name) || !Objects.equals(true_pass, input_pass)){
            System.out.print("Şifre ya da kullanıcı adı yanlış.\nŞifrenizi sıfırlayacak mısınız?(e:Evet, h:Hayır): ");
            String cond = input.nextLine();
            if(Objects.equals(cond, "e")){
                System.out.print("Eski şifre ve yanlış girilen şifre ile aynı olmayan yeni şifrenizi giriniz: ");
                String new_pass = input.nextLine();
                if(Objects.equals(new_pass, true_pass) || Objects.equals(input_pass, new_pass)) System.out.print("Şifreniz eski şifrenizle aynı, işlem başarısız.");
                else System.out.print("Şifre başarıyla sıfırlandı");
            }
        } else {
            System.out.print("Giriş başarılı!");
        }



    }
}

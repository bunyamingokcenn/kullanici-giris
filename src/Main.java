import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName = "patika", password = "java123", userNameInput, passwordInput, newPassword;
        int passwordResetChoise;

        System.out.print("Kullanıcı adı: ");
        userNameInput = input.nextLine();
        System.out.print("Şifre: ");
        passwordInput = input.nextLine();

        if(userNameInput.equals(userName) && passwordInput.equals(password)){
            System.out.println("Kullanıcı girişi Başarılı");
        } else if (userNameInput.equals(userName) && (passwordInput != null && !passwordInput.equals(password))) {
            System.out.println("Şifre hatalı!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?\nEvet için : 1\nHayır için : 2");
            passwordResetChoise = input.nextInt();
            input.nextLine();

            if(passwordResetChoise == 1) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = input.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                } else {
                    password = newPassword;
                    System.out.println("Şifre oluşturuldu");
                    //şifre reset kontrol
                    System.out.print("Yeni şifreniz: " + password);
                }
            } else if (passwordResetChoise == 2) {

                System.out.println("Lütfen sisteme giriş yapmayı yeniden deneyin.");
            }
        } else {
            System.out.println("Kullanıcı bulunamadı");
        }
    }
}
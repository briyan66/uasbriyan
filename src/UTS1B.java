import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UTS1B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input One Patern ( * / # / | ) = ");
        String inputed_string = reader.readLine();
        char o_;
        if(inputed_string.length() > 1){
            System.out.println("Input not valid ..");
        }else{
            o_ = inputed_string.charAt(0);
            int counter = 10;
            if(o_=='*'){
                while(counter < 30){
                    System.out.println(o_);
                    counter++;
                }
            }else if (o_=='#') {
                System.out.println(o_);
                while(counter < 15){
                    counter++;
                    System.out.println("HasTag is confirm..");
                }
            }
        }

    }
}

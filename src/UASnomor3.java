import java.util.ArrayList;
import java.util.Random;

public class UASnomor3 {
    public static void main(String[] args) {
        ArrayList<Integer> kecepatanDiAtasBatasan = new ArrayList<>();
        ArrayList<Integer> kecepatanDiBawahBatasan = new ArrayList<>();

        tangkapanKecepatan(kecepatanDiAtasBatasan, kecepatanDiBawahBatasan);

        System.out.println("Kecepatan kendaraan antara 80 s/d 100 km/jam:");
        tampilkanKecepatan(kecepatanDiAtasBatasan);

        System.out.println("Kecepatan kendaraan di bawah 80 km/jam:");
        tampilkanKecepatan(kecepatanDiBawahBatasan);
    }

    private static void tangkapanKecepatan(ArrayList<Integer> speedsInRange, ArrayList<Integer> speedsBelowRange) {
        int count = 0;
        Random random = new Random();

        while (count < 200) {
            int speed = getRandomSpeed();

            if (speed >= 80 && speed <= 100) {
                speedsInRange.add(speed);
            } else {
                speedsBelowRange.add(speed);
            }

            count++;
        }
    }

    private static int getRandomSpeed() {
        return new Random().nextInt(121); // Generates a random speed between 0 and 120 km/jam
    }

    private static void tampilkanKecepatan(ArrayList<Integer> speeds) {
        for (int speed : speeds) {
            System.out.println(speed + " km/jam");
        }

    }
}

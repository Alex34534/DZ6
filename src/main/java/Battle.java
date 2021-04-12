import java.util.Random;

public class Battle {

    public static void wars() {
        Pers akim = new Pers("Асасин", "Лучник");
        MacedonianWarrior leonid = new MacedonianWarrior("Леонид", "Пехотинец");
        int randomvalue = (int) (Math.random() * 2); // Если 0 бежит/аттакует/защищается перс, если 1 бежит/аттакует/защищается македонец
        int randomvalue2 = (int) (Math.random() * 2); // 0 - победил перс, 1- победил македонец


        if (randomvalue == 0) {
            akim.run();
        } else {
            leonid.run();
        }
        int randomvalue1 = (int) (Math.random() * 2); // Если 0 бежит/аттакует/защищается перс, если 1 бежит/аттакует/защищается македонец

        if (randomvalue1 == 0) {
            akim.attack();
        } else {
            leonid.attack();
        }
        int randomvalue4 = (int) (Math.random() * 2);

        if (randomvalue4 == 0) {
            akim.protection();
        } else {
            leonid.protection();
        }
        int randomvalue5 = (int) (Math.random() * 2);

        if (randomvalue5 == 0) {
            akim.attack();
        } else {
            leonid.attack();
        }

        if (randomvalue2 == 0) {
            akim.kill();
        } else {
            leonid.kill();
        }

    }
}





package _20_09_2023_DataTypeAndVariable.BigDecimal;

import java.math.BigDecimal;

public class _7_RoundingMode {
    public static void main(String[] args) {
        BigDecimal value=new BigDecimal("2.5");//Оргинална  стойност
        BigDecimal halfUp=value.setScale(0, java.math.RoundingMode.HALF_UP);// Закръгляне  нагоре => 3
        BigDecimal halfDown=value.setScale(0, java.math.RoundingMode.DOWN);// Закръгляне  надолу => 2
        BigDecimal halfEven=value.setScale(0, java.math.RoundingMode.HALF_EVEN);//Закръгляне към най-близкото четно число => 2
        BigDecimal ceiling=value.setScale(0, java.math.RoundingMode.CEILING);//Закръгляне към по-голямото цяло число => 3
        BigDecimal floor=value.setScale(0, java.math.RoundingMode.FLOOR);//Закръгляне към по-малкото цяло число => 2
        BigDecimal up=value.setScale(0, java.math.RoundingMode.UP);//Закръгляне нагоре към => 3 (далеч от нулата)
        BigDecimal down=value.setScale(0, java.math.RoundingMode.DOWN);//Закръгляне надолу към => 2 (към нулата)

        System.out.println("Original: " + value);
        System.out.println("HALF_UP: " + halfUp); //Закръгляне нагоре => 3
        System.out.println("HALF_DOWN: " + halfDown);;// Закръгляне  надолу  към => 2
        System.out.println("HALF_EVEN: " + halfEven);//Закръгляне към най-близкото четно число => 2
        System.out.println("CEILING: " + ceiling);;//Закръгляне към по-голямото цяло число => 3
        System.out.println("FLOOR: " + floor);//Закръгляне към по-малкото цяло число => 2
        System.out.println("UP: " + up);//Закръгляне нагоре към => 3 (далеч от нулата)
        System.out.println("DOWN: " + down);//Закръгляне надолу към => 2 (към нулата)


    }
}

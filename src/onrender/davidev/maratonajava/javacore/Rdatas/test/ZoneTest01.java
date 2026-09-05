package onrender.davidev.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println("Esta é zona seu sistema oprecional usa: -> " + ZoneId.systemDefault());
        ZoneId argetinaZone = ZoneId.of("America/Argentina/Buenos_Aires");
        System.out.println("A zona que você escolhe é: -> " + argetinaZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonaDateTime = now.atZone(argetinaZone);
        System.out.println("Você ta na sua zona conforme a hora, mas nessa zona que você escolheu esta " +
                zonaDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonaDateTime2 = nowInstant.atZone(argetinaZone);
        System.out.println(zonaDateTime2 + " <- Essa aqui é a zona ");

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset offsetManaus = ZoneOffset.of("-03:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1 + " <- Esse aqui é o offSet");
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now , offsetManaus);
        System.out.println(offsetDateTime2 + " Mesmo jeito de implementar vai retornar o mesmo objeto, usando o OffsetDateTime");

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3 + " hora de manaus");

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate localDateJapan = LocalDate.of(1970, 2 , 1);
        JapaneseDate localDateJapan1 = JapaneseDate.from(localDateJapan);
        System.out.println(localDateJapan1);

    }
}

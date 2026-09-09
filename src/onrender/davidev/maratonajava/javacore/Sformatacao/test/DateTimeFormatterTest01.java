package onrender.davidev.maratonajava.javacore.Sformatacao.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20260908", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("Formatação da data ficando igual ISO_LOCAL_DATE ou a ISO_DATE: " + parse1);
        System.out.println("============================================================================");

        LocalDate parse2 = LocalDate.parse("2026-09-08+06:00", DateTimeFormatter.ISO_DATE);
        System.out.println("A ISO_DATE aceita o offset " + parse2);
        LocalDate parse3 = LocalDate.parse("2026-09-08", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("A ISO_LOCAL_DATE não aceita o offset acontece uma exception " + parse3);
        System.out.println("============================================================================");

        LocalDateTime now  = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Bem parecido com o LocalDateTime a impressão: " + s4);
        LocalDateTime parse4 = LocalDateTime.parse("2026-09-08T20:48:40.3175932", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Também funciona usando parse: " + parse4);
        System.out.println("============================================================================");

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println("Formatação da data no padrão BR usando Formatter: " + formatBR);
        LocalDate parseBR = LocalDate.parse("09/09/2026", formatterBR);
        System.out.println("Mesmo valor usando a formatação parse: " + parseBR);
        System.out.println("============================================================================");

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println("Formatação da data na Alemanha usando Formatter: " + formatGR);
        LocalDate parseGR = LocalDate.parse("08.September.2026" , formatterGR);
        System.out.println("Formatação da data na Alemanha usando parse: " + parseGR);

    }
}

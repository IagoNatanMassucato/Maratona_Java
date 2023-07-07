package MaratonaJava.Fase6.Calendario;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cald = Calendar.getInstance();
        if(cald.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(cald.get(Calendar.DAY_OF_WEEK));
        System.out.println(cald.get(Calendar.DAY_OF_MONTH));
        System.out.println(cald.get(Calendar.DAY_OF_YEAR));
        System.out.println(cald.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        cald.add(Calendar.DAY_OF_MONTH, 2);
        cald.roll(Calendar.HOUR, 12);
        Date date = cald.getTime();
        System.out.println(date);
    }
}

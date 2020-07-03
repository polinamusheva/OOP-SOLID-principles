package Logger;

public interface Appender {

     void append(String dateTime, ReportLevel reportLevel, String message);
}

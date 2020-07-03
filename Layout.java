package Logger;

public interface Layout {
    String format (String dateTime, ReportLevel reportLevel, String message);
}

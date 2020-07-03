package Logger;


public class MessageLogger implements Logger {

    private Appender[] appenders;

    // VERY IMPORTANT NEW KNOWLEDGE
    public MessageLogger(Appender... appenders) {

        this.appenders = appenders;

    }


    @Override
    public void logError(String dateTime, String message) {

        Log(dateTime, message, ReportLevel.ERROR);
    }

    @Override
    public void logInfo(String dateTime, String message) {

        Log(dateTime, message, ReportLevel.INFO);

    }

    private void Log(String dateTime, String message, ReportLevel reportLevel) {

        for (Appender appender : this.appenders) {
            appender.append(dateTime, reportLevel, message);
        }

    }
}

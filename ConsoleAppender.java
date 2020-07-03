package Logger;

public class ConsoleAppender extends AppenderImpl{

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String dateTime, ReportLevel reportLevel, String message) {

        System.out.println(super.getLayout().format(dateTime, reportLevel, message));

    }
}

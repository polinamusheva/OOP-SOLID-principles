package Logger;

public class FileAppender extends AppenderImpl {

    private LogFile file;

    public FileAppender(Layout layout) {
        super(layout);
        this.setFile(file);
    }

    @Override
    public void append(String dateTime, ReportLevel reportLevel, String message) {
            this.file.write(super.getLayout().format(dateTime, reportLevel, message));
    }

    public void setFile(File file) {
        this.file = new LogFile();
    }

    public File getFile(){
        return this.file;
    }
}


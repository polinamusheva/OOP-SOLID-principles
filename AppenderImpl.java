package Logger;

public abstract class  AppenderImpl implements Appender{
    private Layout layout;

    public AppenderImpl(Layout layout) {
        this.layout = layout;
    }

    public Layout getLayout() {
        return this.layout;
    }

}

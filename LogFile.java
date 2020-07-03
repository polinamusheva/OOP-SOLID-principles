package Logger;

public class LogFile implements File {
    private StringBuilder text;

    public LogFile() {
        this.text = new StringBuilder();
    }

    public void write(String input) {
        this.getText().append(input);
    }

    public StringBuilder getText() {
        return this.text;
    }

    @Override
    public int getSize() {

        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                sum += text.charAt(i);
            }

        }

        return sum;
    }

}

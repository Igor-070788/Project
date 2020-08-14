package calc;

import java.util.Arrays;

public class Answer {
    public boolean success;
    public int result;
    public String[] errors;

    public Answer() {
    }

    public static Answer getAccess (int result) {
        Answer ans = new Answer();
        ans.success = true;
        ans.result = result;
        return ans;
    }

    public static Answer getError (String[] errors) {
        Answer ans = new Answer();
        ans.success = false;
        ans.errors = errors;
        return ans;
    }

    public String toString() {
        return (success) ? Integer.toString(this.result) : Arrays.toString(this.errors);
    }
}

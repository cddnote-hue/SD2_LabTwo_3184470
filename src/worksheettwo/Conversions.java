package worksheettwo;

//studentinfo: tongwei.chen, 3184470
public class Conversions {

    public double euroToDollar(double euro) {
        return euro * 1.1;
    }

    public double dollarToEuro(double dollar) {
        return dollar / 1.1;
    }

    public int stringToInteger(String val) {
        return Integer.parseInt(val);
    }

    public String integerToString(int val) {
        return Integer.toString(val);
    }

    public String switchCase(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        return result;
    }
}
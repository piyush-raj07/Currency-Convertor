
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class readfile {
    public double getcurrencyvalue(String currinput, String curroutput) {
        double value = 0;
        try (FileReader fr = new FileReader("filecurrency.txt");
                BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split("\\s+");
                if (currinput.equals(columns[0]) && curroutput.equals(columns[1])) {
                    value = Double.parseDouble(columns[2]);
                    // return value;
                    break;

                }
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return value;

    }
}

class currency_variable extends readfile {
    double currency;
    String currinput;
    String curroutp;
    // double currencyoutp;

    currency_variable() {

    }

    currency_variable(String currinput) {
        this.currinput = currinput;

    }

    public String getinput(String currinput) {
        Scanner sc = new Scanner(System.in);
        this.currinput = currinput;
        System.out.println("enter the currency value:");
        currency = sc.nextDouble();

        System.out.println("enter the output currency you want:");
        curroutp = sc.next();

        return this.curroutp;

    }

    public boolean checks(String curroutput) {
        if (curroutput.equals("dollar") || curroutput.equals("euro") || curroutput.equals("rupee")
                || curroutput.equals("dirham") || curroutput.equals("pound")) {
            return true;
        } else
            System.out.println("Invalid output currency");
        return false;

    }

    public void display(double value) {
        String formattedValue = String.format("%.4f", value);
        System.out.println(currency + " " + this.currinput + " " + "=" + " " + formattedValue + " " + this.curroutp);
    }

    public double calcualation(double value) {
        return value * currency;
    }

}

public class currency {

    public static void main(String args[]) {

        System.out.println("Welcome to the currency converter");
        String choice = "yes";
        while (choice.equals("yes")) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your input currency ");
            System.out.println("Rupee - R" + "\n" + "Dollar - D" + "\n" + "Euro - E" + "\n" + "Pound - P" + "\n"
                    + "Dirham- DI" + "\n" + " ");
            String currinput = sc.next();

            if (currinput.equals("dollar") || currinput.equals("euro") || currinput.equals("rupee")
                    || currinput.equals("dirham") || currinput.equals("pound")) {
                currency_variable objd = new currency_variable();
                String curroutp = objd.getinput(currinput);
                boolean b = objd.checks(curroutp);

                if (b == true) {
                    double value = objd.getcurrencyvalue(currinput, curroutp);
                    double ans = objd.calcualation(value);
                    objd.display(ans);
                }
            } else
                System.out.println("Invalid input currency");

            System.out.println("enter your choice yes/no");
            choice = sc.next();

            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("enter the choice only  yes/no");
                choice = sc.next();
            }
            System.out.println();
        }

        System.out.println("Thanks for using!");
    }
}



import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class readfile {
    public double getcurrencyvalue(String currinput, String curroutput) {
        double value = 0;
        try (FileReader fr = new FileReader("filecurrency.txt");
                BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split("\\s+");
                if (currinput.equals(columns[0]) && curroutput.equals(columns[1])) {
                    value = Double.parseDouble(columns[2]);
                    // return value;
                    break;

                }
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return value;

    }
}

class currency_variable extends readfile {
    double currency;
    String currinput;
    String curroutp;
    // double currencyoutp;

    currency_variable() {

    }

    currency_variable(String currinput) {
        this.currinput = currinput;

    }

    public String getinput(String currinput) {
        Scanner sc = new Scanner(System.in);
        this.currinput = currinput;
        System.out.println("enter the currency value:");
        currency = sc.nextDouble();

        System.out.println("enter the output currency you want:");
        curroutp = sc.next();
        curroutp=curroutp.toLowerCase();

        return this.curroutp;

    }

    public boolean checks(String curroutput) {
        if (curroutput.equals("dollar") || curroutput.equals("euro") || curroutput.equals("rupee")
                || curroutput.equals("dirham") || curroutput.equals("pound")) {
            return true;
        } else
            System.out.println("Invalid output currency");
        return false;

    }

    public void display(double value) {
        String formattedValue = String.format("%.4f", value);
        System.out.println(currency + " " + this.currinput + " " + "=" + " " + formattedValue + " " + this.curroutp);
    }

    public double calcualation(double value) {
        return value * currency;
    }

}

public class currency {

    public static void main(String args[]) {

        System.out.println("Welcome to the currency converter");
        String choice = "yes";
        while (choice.equals("yes")) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your input currency ");
            System.out.println("Rupee " + "\n" + "Dollar " + "\n" + "Euro " + "\n" + "Pound " + "\n"
                    + "Dirham" + "\n" + " ");
            String currin = sc.next();
           String currinput= currin.toLowerCase();

            if (currinput.equals("dollar") || currinput.equals("euro") || currinput.equals("rupee")
                    || currinput.equals("dirham") || currinput.equals("pound")) {

                currency_variable objd = new currency_variable();
                String curroutp = objd.getinput(currinput);
                boolean b = objd.checks(curroutp);

                if (b == true) {
                    double value = objd.getcurrencyvalue(currinput, curroutp);
                    double ans = objd.calcualation(value);
                    objd.display(ans);
                }
            } else
                System.out.println("Invalid input currency");

            System.out.println("enter your choice yes/no");
            choice = sc.next();

            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("enter the choice only  yes/no");
                choice = sc.next();
                choice=choice.toLowerCase();
            }
            System.out.println();
        }

        System.out.println("Thanks for using!");
    }
}

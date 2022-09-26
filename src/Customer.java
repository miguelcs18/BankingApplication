import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, String email, ArrayList<Double> transactions) {
        this.name = name;
        this.email = email;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}

package training.supportbank;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<Account> Accounts;
    public ArrayList<Transaction> Transactions;

    public Bank(List<Account> accounts, ArrayList<Transaction> transactions) {
        Accounts = accounts;
        Transactions = transactions;
    }
    // To carry out the transaction between different accounts


}



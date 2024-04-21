package ex12_RealWorld;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(List<BankTransaction> bankTransactions){
        this.bankTransactions=bankTransactions;
    }

    public double calcTotalAmount(){
        double total=0d;
        for ( BankTransaction bankTransaction : bankTransactions){
            double amount=bankTransaction.getAmount();
            total+=amount;
        }
        return total;
    }

    public double calcTotalInMonth(Month month){
        double total=0d;
        BankStatementCSVParser bankStatementCSVParser=new BankStatementCSVParser();
            List<BankTransaction> bankTransactionsInMonth=  bankStatementCSVParser.selectInMonth(bankTransactions, month); // List<BankTransaction>
        for(BankTransaction bankTransaction : bankTransactionsInMonth){
            total+=bankTransaction.getAmount();
        }
        return  total;
    }

    public double calcTotalAmount1(Month month){
        double total=0d;
        for( BankTransaction bankTransaction : bankTransactions){
            if(bankTransaction.getDate().getMonth() == month){
                total+=bankTransaction.getAmount();
            }
        }
        return  total;
    }

    public double calcTotalForCategory(String category){
        double total=0d;
        for(BankTransaction bankTransaction : bankTransactions){
            if(bankTransaction.getDescription().equals(category)){
                total+=bankTransaction.getAmount();
            }
        }
        return total;
    }

    public List<BankTransaction> findTransactionsGreaterThanEqual(int amount){
        List<BankTransaction> bankTransactionList=new ArrayList<>();
        for(BankTransaction bankTransaction : bankTransactions){
            if(bankTransaction.getAmount() > amount){
                bankTransactionList.add(bankTransaction);
            }
        }
        return bankTransactionList;
    }

    public List<BankTransaction> findTransactionInMonthAndGreater(int amount, Month month){
        List<BankTransaction> result=new ArrayList<>();
        for(BankTransaction bankTransaction : bankTransactions){
            if( bankTransaction.getAmount() > amount || bankTransaction.getDate().getMonth() == month){
                result.add(bankTransaction);
            }
        }
        return result;
    }

    @FunctionalInterface
    public interface BankTransactionFilter{
        boolean test(BankTransaction bankTransaction);
    }

    public List<BankTransaction> findTransaction(BankTransactionFilter bankTransactionFilter){
        List<BankTransaction> result=new ArrayList<>();
        for(BankTransaction bankTransaction : bankTransactions){
            if(bankTransactionFilter.test(bankTransaction)){
                result.add(bankTransaction);
            }
        }
        return result;
    }

}

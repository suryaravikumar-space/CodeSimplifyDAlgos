package surya.dsa.datastructures.linkedlist;

public class LinkedList1 {

    public static void main(String[] args) {

        AccountInfo Ravi = new AccountInfo("Savings","Ravi",123456789d,490000.4F);
        AccountInfo Himavanth = new AccountInfo("Savings","Himavanth",123456789d,490000.4F);
        LinkedList ls = new LinkedList();
        ls.add(Ravi);
        ls.add(Himavanth);
        //ls.add(null);

        AccountNode current = ls.head;
        while(current != null){
            System.out.println(current.accountInfo.getAccountBalance()+"  " + current.accountInfo.getAccountNumber()+"   " + current.accountInfo.getAccountType() + current.accountInfo.getUserName());
            current = current.next;
        }


    }



}

class AccountNode {

    // data , reference   ---->  AccountInfo
    public AccountInfo accountInfo;
    public AccountNode next;


}

class LinkedList {
    AccountNode head;

    public void add(AccountInfo accountInfo){
        AccountNode newAccountNode = new AccountNode();

        newAccountNode.accountInfo = accountInfo;
        newAccountNode.next = null;

        if(head == null){
            head = newAccountNode;
        }
        else{
            AccountNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newAccountNode;
        }



    }


}


class AccountInfo {

    String accountType;  // Savings, Current, Corporate...
    String userName;

    Double accountNumber;
    Float accountBalance;


    public AccountInfo(String accountType, String userName, Double accountNumber, Float accountBalance) {
        this.accountType = accountType;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }


    public String getAccountType() {
        return accountType;
    }

    public String getUserName() {
        return userName;
    }

    public Double getAccountNumber() {
        return accountNumber;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }


}

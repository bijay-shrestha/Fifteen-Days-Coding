package com.fifteendays.coding.day06.hard;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AmazonQuestion {

    public static void main(String[] args) {

        Transaction t1 = new Transaction(LocalDate.of(2026,2,1), 1500D);
        Transaction t2 = new Transaction(LocalDate.of(2026,1,1), 20000D);
        Transaction t3 = new Transaction(LocalDate.of(2026,3,3), 20000D);
        Transaction t4 = new Transaction(LocalDate.of(2026,4,1), 20000D);
        Transaction t5 = new Transaction(LocalDate.of(2026,5,1), 1500D);
        Transaction t6 = new Transaction(LocalDate.of(2026,6,1), 21000D);
        Transaction t7 = new Transaction(LocalDate.of(2026,7,1), 20000D);
        Transaction t8 = new Transaction(LocalDate.of(2026,2,1), 20000D);
        Transaction t9 = new Transaction(LocalDate.of(2026,1,1), 1500D);
        Transaction t10 = new Transaction(LocalDate.of(2026,2,1), 20000D);
        Transaction t11 = new Transaction(LocalDate.of(2026,11,20), 20000D);
        Transaction t12 = new Transaction(LocalDate.of(2026,3,3), 20000D);
        Transaction t13= new Transaction(LocalDate.of(2026,2,1), 1500D);
        Transaction t14 = new Transaction(LocalDate.of(2026,5,2), 20000D);
        Transaction t15 = new Transaction(LocalDate.of(2026,2,1), 1500D);
        Transaction t16 = new Transaction(LocalDate.of(2026,2,1), 20000D);
        Transaction t17 = new Transaction(LocalDate.of(2026,2,1), 1500D);
        Transaction t18 = new Transaction(LocalDate.of(2026,2,1), 22000D);
        Transaction t19 = new Transaction(LocalDate.of(2026,5,2), 1500D);
        Transaction t20 = new Transaction(LocalDate.of(2026,5,5), 2500D);

        List<Transaction> transactions = List.of(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20);
        //Q: Given a list of transactions, find the total amount per day using groupingBy + summing

        Map<LocalDate, Double> transcationListByDate = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getTransactionDate,
                        Collectors.summingDouble(Transaction::getTransactionAmount)));

        System.out.println(transcationListByDate);


    }

    static class Transaction {
        private LocalDate transactionDate;
        private Double transactionAmount;

        public Transaction(LocalDate transactionDate, Double transactionAmount) {
            this.transactionDate = transactionDate;
            this.transactionAmount = transactionAmount;
        }

        public LocalDate getTransactionDate() {
            return transactionDate;
        }

        public Double getTransactionAmount() {
            return transactionAmount;
        }
    }
}

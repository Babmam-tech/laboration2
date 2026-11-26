package se.iths.eitvydas.main.model;

import java.time.LocalDate;

public class AccessCard {
    private Integer cardId;
    private String cardNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;

    public AccessCard(String cardNumber, LocalDate issueDate, LocalDate expiryDate) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public Integer getCardId() {
        return cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}


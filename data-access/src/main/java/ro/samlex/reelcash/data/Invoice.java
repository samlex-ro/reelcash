package ro.samlex.reelcash.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Invoice {
    private final UUID uuid = UUID.randomUUID();
    private Integer number;
    private Date date;
    private Party recipient;
    private Party emitter;
    private final List<InvoiceItem> invoicedItems = new ArrayList<>();
    
    public Party getEmitter() {
        return emitter;
    }

    public Party getRecipient() {
        return recipient;
    }

    public List<InvoiceItem> getInvoicedItems() {
        return invoicedItems;
    }

    public void setEmitter(Party value) {
        if (value == null) {
            throw new IllegalArgumentException("Invoice.setEmitter: new emitter is null");
        }
        this.emitter = value;
    }

    public void setRecipient(Party value) {
        if (value == null) {
            throw new IllegalArgumentException("Invoice.setRecipient: new recipient is null");
        }
        recipient = value;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Invoice other = (Invoice) obj;
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        return Objects.equals(this.date, other.date);
    }
    
    
}
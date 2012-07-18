package pgu;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.sun.istack.internal.NotNull;

public class Account {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    @NumberFormat(style = Style.CURRENCY)
    private BigDecimal balance = new BigDecimal("1000");

    @NotNull
    @NumberFormat(style = Style.PERCENT)
    private BigDecimal equityAllocation = new BigDecimal(".60");

    @DateTimeFormat(style = "S-")
    private Date renewalDate = new Date(new Date().getTime() + 31536000000L);

    public Long getId() {
        return id;
    }

    void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(final BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getEquityAllocation() {
        return equityAllocation;
    }

    public void setEquityAllocation(final BigDecimal equityAllocation) {
        this.equityAllocation = equityAllocation;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(final Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    Long assignId() {
        id = idSequence.incrementAndGet();
        return id;
    }

    private static final AtomicLong idSequence = new AtomicLong();

}
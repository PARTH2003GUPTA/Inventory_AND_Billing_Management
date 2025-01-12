package com.pdqa.enterpriseManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.util.Pair;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document(collation = "enterprisedb")
public class BillingRecord {
    @Id
    private String billingId;
    private List<Map<ProductKey,Integer>>  listOfProducts;
//    private Integer purchaseAmount;
    private LocalDate sellingDate;
    private String billngName;
}
